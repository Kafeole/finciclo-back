package es.dgraph.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.dgraph.model.CssModelo;
import es.dgraph.model.DatoModelo;
import es.dgraph.model.HtmlModelo;
import es.dgraph.model.LibModelo;
import es.dgraph.model.MidwayModelo;
import es.dgraph.model.ProyectoModelo;
import es.dgraph.model.ScriptModelo;
import es.dgraph.repository.LibRepository;
import es.dgraph.repository.ProyectoRepository;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(path="/libs")
public class LibController {
	
	@Autowired
	public LibRepository libRepository;
	
	@Autowired
	public ProyectoRepository proRepository;
	
	public ProyectoModelo proModelo;
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Libs guardados")
	public @ResponseBody Iterable<LibModelo> getAllLib(){
		
		return libRepository.findAll();
	}
	
	@GetMapping(path="/nombre")
	@ApiOperation(value = "Muestra todos los Libs guardados")
	public @ResponseBody ArrayList<String> getAllLibNames(){
		
		Iterable<LibModelo> libs =  libRepository.findAll();
		
		ArrayList<String> noms = new ArrayList<String>();
		
		for(LibModelo li : libs) {
			noms.add(li.nombre);
		}
		
		return  noms;
	}
	
	@PostMapping(path="/add")
	@ApiOperation(value = "Añade una librería a la base de datos, devuelve una confirmación de éxito o fallo")
	public @ResponseBody String addLib(@RequestBody HashMap<String, String> cuerpo) {
		
		LibModelo lib = new LibModelo();
		
		if(cuerpo.get("valor") != null && !cuerpo.get("valor").equals("")) {
			
			lib = libRepository.findLibModeloByValor(cuerpo.get("valor"));
			if(lib != null) {
				
				if(cuerpo.get("deseo").equals("Si") && proyectoExiste(cuerpo)) {
					anadirLib(cuerpo, lib);
				}
				return "Ya existe";
			}else {
				
				lib = new LibModelo();
				lib.setValor(cuerpo.get("valor"));
				lib.setNombre(cuerpo.get("nombre"));
				lib = libRepository.save(lib);
				
				if(cuerpo.get("deseo").equals("Si") && proyectoExiste(cuerpo)) {
					
					anadirLib(cuerpo, lib);
				}
				
				return "exito";
			
			}
		}
	
		return "";
			
	}
	
	public Boolean proyectoExiste(HashMap<String,String> cuerpo) {
		
		if(cuerpo.get("proyecto") != null ) {
			if(!cuerpo.get("proyecto").equals("")) {
				try {
					ProyectoModelo pro = proRepository.findByIdent(Integer.parseInt(cuerpo.get("proyecto")));
					if(pro != null) {
						return true;
					}else {
						return false;
					}
				}catch(Exception e) {
				
				}
			}
		}
		return false;
	}
	public void anadirLib(HashMap<String, String> cuerpo, LibModelo lib) {
		
		ProyectoModelo pro = proRepository.findByIdent(Integer.parseInt(cuerpo.get("proyecto")));
		for(LibModelo libreria : pro.getLibrerias()) {
			if(libreria.getValor().equals(cuerpo.get("proyecto"))) {
				return;
			}
		}
		pro.getLibrerias().add(lib);
		proRepository.save(pro);
	}
	
	
}