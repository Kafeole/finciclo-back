package es.dgraph.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import es.dgraph.model.ScriptModelo;


public interface ScriptRepository extends  CrudRepository<ScriptModelo, Integer> {

	List<ScriptModelo> findScriptModeloByNombre(String nombre);
	

}
