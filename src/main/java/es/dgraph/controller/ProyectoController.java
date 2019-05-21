package es.dgraph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.dgraph.model.HtmlModelo;
import es.dgraph.repository.HtmlRepository;
import es.dgraph.model.ScriptModelo;
import es.dgraph.repository.ScriptRepository;
import es.dgraph.model.CssModelo;
import es.dgraph.repository.CssRepository;
import es.dgraph.model.ProyectoModelo;
import es.dgraph.repository.ProyectoRepository;
import io.swagger.annotations.ApiOperation;


@Controller
@RequestMapping(path="/proyectos")
public class ProyectoController {
	
	@Autowired
	public ProyectoRepository proyectoRepository;
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Proyectoss guardados")
	public @ResponseBody Iterable<ProyectoModelo> getAllProyectos(){
		
		return proyectoRepository.findAll();
	}

}
