package es.dgraph.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import es.dgraph.model.HtmlModelo;
import es.dgraph.repository.HtmlRepository;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(path="/html")
public class HtmlController {
	
	@Autowired
	public HtmlRepository htmlRepository;
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Htmls guardados")
	public @ResponseBody Iterable<HtmlModelo> getAllHtmls(){
		
		return htmlRepository.findAll();
	}
	
	@GetMapping(path="/id/{id}")
	@ApiOperation(value = "Muestra información del Html solicitado (buscado por ident)")
	public @ResponseBody HtmlModelo getHtmlById(@PathVariable Integer id) {
		
		return htmlRepository.findById(id).orElse(null);
	}
	
	@GetMapping(path="/nombre/{nombre}")
	@ApiOperation(value = "Muestra coincidencias de Htmls con el nombre solicitado")
	public @ResponseBody Iterable getHtmlByNombre(@PathVariable String nombre) {
		
		return htmlRepository.findHtmlModeloByNombre(nombre);
	}
	
	@DeleteMapping(path="/delete/{ident}")
	@ApiOperation(value = "Elimina un Html de la base de datos (buscado por ident) y devuelve una confirmación de éxito o fallo")
	public @ResponseBody String deleteHtml(@PathVariable Integer ident) {
		
		htmlRepository.deleteById(ident);
	    return "Eliminado";
	}
	
	@PostMapping(path="/add") 
	@ApiOperation(value = "Añade un Contacto a la base de datos y devuelve una confirmación de éxito o fallo")
	public @ResponseBody String addHtml (@RequestBody HtmlModelo cuerpo) {
			
		htmlRepository.save(cuerpo);
		return "Guardado";
	}
	
	@PutMapping(path="/update/{ident}")
	@ApiOperation(value = "Actualiza un Html, búscando la coincidencia por ident y devuelve dicho Html")
	public @ResponseBody HtmlModelo updateHtmlModelo(@PathVariable Integer ident, 
												 @RequestBody HtmlModelo mihtmlModelo) {
		
		HtmlModelo htmlModelo = htmlRepository.findById(ident).orElse(null);
		try {
			htmlModelo.setNombre(mihtmlModelo.getNombre());
			htmlModelo.setValor(mihtmlModelo.getValor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
										 
		htmlRepository.save(htmlModelo);
		return htmlRepository.findById(ident).orElse(null);
	}
	
	
}
