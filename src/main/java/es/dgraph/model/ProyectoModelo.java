package es.dgraph.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="t_proyecto")
public class ProyectoModelo implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer ident;
	
	public String nombre;
	
	@OneToOne(optional=false, cascade= CascadeType.ALL)
    @JoinColumn(name = "ident_html", nullable=true)
    private HtmlModelo modeloHtml;
	
	@OneToOne(optional=false, cascade= CascadeType.ALL)
    @JoinColumn(name = "ident_css", nullable=true)
    private CssModelo modeloCss;

	@OneToOne(optional=false, cascade= CascadeType.ALL)
    @JoinColumn(name = "ident_script", nullable=true)
    private ScriptModelo modeloJs;
	
	@OneToOne(optional=false, cascade= CascadeType.ALL)
    @JoinColumn(name = "ident_dato", nullable=true)
    private DatoModelo modeloDato;
	
	
	 @ManyToMany
	    @JoinTable(name = "t_midway",
	        joinColumns = @JoinColumn(name = "ident_proyecto", referencedColumnName = "ident"),
	        inverseJoinColumns = @JoinColumn(name = "ident_lib", referencedColumnName = "ident"))
	    private Set<LibModelo> librerias;
	 
	public ProyectoModelo(){}

	public ProyectoModelo(String nombre, HtmlModelo modeloHtml, CssModelo modeloCss, ScriptModelo modeloJs,
			DatoModelo modeloDato, Set<LibModelo> librerias) {

		this.nombre = nombre;
		this.modeloHtml = modeloHtml;
		this.modeloCss = modeloCss;
		this.modeloJs = modeloJs;
		this.modeloDato = modeloDato;
		this.librerias = librerias;
	}

	public Integer getIdent() {
		return ident;
	}

	public String getNombre() {
		return nombre;
	}

	public HtmlModelo getModeloHtml() {
		return modeloHtml;
	}

	public CssModelo getModeloCss() {
		return modeloCss;
	}

	public ScriptModelo getModeloJs() {
		return modeloJs;
	}

	public DatoModelo getModeloDato() {
		return modeloDato;
	}

	public Set<LibModelo> getLibrerias() {
		return librerias;
	}

	public void setIdent(Integer ident) {
		this.ident = ident;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setModeloHtml(HtmlModelo modeloHtml) {
		this.modeloHtml = modeloHtml;
	}

	public void setModeloCss(CssModelo modeloCss) {
		this.modeloCss = modeloCss;
	}

	public void setModeloJs(ScriptModelo modeloJs) {
		this.modeloJs = modeloJs;
	}

	public void setModeloDato(DatoModelo modeloDato) {
		this.modeloDato = modeloDato;
	}

	public void setLibrerias(Set<LibModelo> librerias) {
		this.librerias = librerias;
	}
	 
	 


}
