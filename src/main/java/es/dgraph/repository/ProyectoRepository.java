package es.dgraph.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import es.dgraph.model.ProyectoModelo;


public interface ProyectoRepository extends  CrudRepository<ProyectoModelo, Integer> {

	List<ProyectoModelo> findProyectoModeloByNombre(String nombre);
	
	ProyectoModelo  findByIdent(Integer ident);

}
