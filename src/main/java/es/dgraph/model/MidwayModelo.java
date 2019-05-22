package es.dgraph.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_midway")
public class MidwayModelo implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer ident;
	
	@OneToOne(optional=false/*, cascade= CascadeType.ALL*/)
    @JoinColumn(name = "ident_proyecto", nullable=true)
    private ProyectoModelo modeloProyecto;
	
	@OneToOne(optional=false/*, cascade= CascadeType.ALL*/)
    @JoinColumn(name = "ident_lib", nullable=true)
    private LibModelo modeloLib;

	public MidwayModelo() {
	}

	public MidwayModelo(ProyectoModelo modeloProyecto, LibModelo modeloLib) {
		super();
		this.modeloProyecto = modeloProyecto;
		this.modeloLib = modeloLib;
	}

	public Integer getIdent() {
		return ident;
	}

	public ProyectoModelo getModeloProyecto() {
		return modeloProyecto;
	}

	public LibModelo getModeloLib() {
		return modeloLib;
	}

	public void setIdent(Integer ident) {
		this.ident = ident;
	}

	public void setModeloProyecto(ProyectoModelo modeloProyecto) {
		this.modeloProyecto = modeloProyecto;
	}

	public void setModeloLib(LibModelo modeloLib) {
		this.modeloLib = modeloLib;
	}
	
	
	
	
	
	
	
}