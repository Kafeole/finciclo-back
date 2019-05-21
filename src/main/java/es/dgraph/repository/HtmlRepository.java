package es.dgraph.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import es.dgraph.model.HtmlModelo;


public interface HtmlRepository extends  CrudRepository<HtmlModelo, Integer> {

	List<HtmlModelo> findHtmlModeloByNombre(String nombre);
	

}