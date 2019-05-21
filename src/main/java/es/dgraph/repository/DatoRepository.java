package es.dgraph.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import es.dgraph.model.DatoModelo;


public interface DatoRepository extends  CrudRepository<DatoModelo, Integer> {

	

}