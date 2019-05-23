package es.dgraph.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.dgraph.model.MidwayModelo;
import es.dgraph.model.ProyectoModelo;
import es.dgraph.repository.CssRepository;
import es.dgraph.repository.DatoRepository;
import es.dgraph.repository.HtmlRepository;
import es.dgraph.repository.LibRepository;
import es.dgraph.repository.MidwayRepository;
import es.dgraph.repository.ProyectoRepository;
import es.dgraph.repository.ScriptRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping(path="/midway")
public class MidwayController {
	
	@Autowired
	public ProyectoRepository proyectoRepository;
	
	@Autowired
	public HtmlRepository htmlRepository;
	
	@Autowired
	public CssRepository cssRepository;
	
	@Autowired
	public ScriptRepository scriptRepository;
	
	@Autowired
	public DatoRepository datoRepository;
	
	@Autowired
	public LibRepository libRepository;
	
	@Autowired
	public MidwayRepository midRepository;
	
	
	
	@DeleteMapping(path="/deletelibs/{identpro}/{identlib}")
	@ApiOperation(value = "Elimina librerias asociadas a un Proyecto")
	public @ResponseBody String deleteLibsdeProyecto(/*@RequestBody Integer[] cuerpo*/@PathVariable Integer identpro,
			@PathVariable Integer identlib) {
		
		ProyectoModelo pro = proyectoRepository.findByIdent(identpro);
		if(pro != null) {
			for(MidwayModelo midway: midRepository.findByModeloProyecto(pro)){
																// este && sobre pero bueno
				if(midway.getModeloLib().getIdent() == identlib && midway.getModeloProyecto().getIdent() == identpro) {
					midRepository.deleteById(midway.getIdent());
					return "Exito";
				}
			}
		}
			
		return "Fallo";
		
	}
	
}
	