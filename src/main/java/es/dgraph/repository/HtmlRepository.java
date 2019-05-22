package es.dgraph.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import es.dgraph.model.CssModelo;
import es.dgraph.model.HtmlModelo;


public interface HtmlRepository extends  CrudRepository<HtmlModelo, Integer> {

	List<HtmlModelo> findHtmlModeloByNombre(String nombre);

	HtmlModelo findHtmlModeloByValor(String html);
	
	HtmlModelo findByIdent(Integer ident);


}
