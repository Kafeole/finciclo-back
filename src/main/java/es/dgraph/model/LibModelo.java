package es.dgraph.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="t_lib")
public class LibModelo implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer ident;
	
	public String nombre;
	
    public String valor;
    
  //  @ManyToMany(mappedBy = "librerias")
   // private Set<ProyectoModelo> proyectos = new HashSet<>();

    public LibModelo() {
    	
    }
    
	public LibModelo(Integer ident, String nombre, String valor/*, Set<ProyectoModelo> books*/) {
		super();
		this.ident = ident;
		this.nombre = nombre;
		this.valor = valor;
		//this.books = books;
	}

	public Integer getIdent() {
		return ident;
	}

	public String getNombre() {
		return nombre;
	}

	public String getValor() {
		return valor;
	}

	/*public Set<ProyectoModelo> getBooks() {
		return books;
	}*/

	public void setIdent(Integer ident) {
		this.ident = ident;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setBooks(Set<ProyectoModelo> books) {
	//	this.books = proyectos;
	}

    
}
