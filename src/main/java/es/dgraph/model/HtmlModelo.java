package es.dgraph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="t_html")
public class HtmlModelo implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer ident;
	
    public String nombre;
    
    @Type(type="text")
    public String valor;
    
    public HtmlModelo() {}
    
    public HtmlModelo( String nombre, String valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}

	public Integer getIdent() {
		return ident;
	}

	public void setIdent(Integer ident) {
		this.ident = ident;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
    
   
}
