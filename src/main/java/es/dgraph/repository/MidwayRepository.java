package es.dgraph.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.dgraph.model.LibModelo;
import es.dgraph.model.MidwayModelo;
import es.dgraph.model.ProyectoModelo;

public interface MidwayRepository extends  CrudRepository<MidwayModelo, Integer> {


	List<MidwayModelo> findByModeloProyecto(ProyectoModelo modeloProyecto);
	
	MidwayModelo findByIdent(Integer ident);
}
