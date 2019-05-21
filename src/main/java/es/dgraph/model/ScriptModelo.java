package es.dgraph.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="t_script")
public class ScriptModelo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer ident;
	
	public String nombre;
	
	@Type(type="text")
    public String valor;
}
