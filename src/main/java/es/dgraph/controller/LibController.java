package es.dgraph.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.dgraph.model.LibModelo;
import es.dgraph.repository.LibRepository;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(path="/libs")
public class LibController {
	
	@Autowired
	public LibRepository libRepository;
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Libs guardados")
	public @ResponseBody Iterable<LibModelo> getAllLib(){
		
		return libRepository.findAll();
	}
	
	@GetMapping(path="/nombres")
	@ApiOperation(value = "Muestra todos los Libs guardados")
	public @ResponseBody ArrayList<String> getAllLibNames(){
		
		Iterable<LibModelo> libs =  libRepository.findAll();
		
		ArrayList<String> noms = new ArrayList<String>();
		
		for(LibModelo li : libs) {
			noms.add(li.nombre);
		}
		
		return  noms;
	}
	
	
}