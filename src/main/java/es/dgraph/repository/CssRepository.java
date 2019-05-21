package es.dgraph.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.dgraph.model.CssModelo;


public interface CssRepository extends  CrudRepository<CssModelo, Integer> {

	List<CssModelo> findCssModeloByNombre(String nombre);
	

}
