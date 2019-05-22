package es.dgraph.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import es.dgraph.model.LibModelo;


public interface LibRepository extends  CrudRepository<LibModelo, Integer> {

	List<LibModelo> findLibModeloByNombre(String nombre);
	
	LibModelo findLibModeloByValor(String valor);
	
	LibModelo findByIdent(Integer ident);
	
	

}
