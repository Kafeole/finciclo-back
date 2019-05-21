package es.dgraph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.dgraph.model.CssModelo;
import es.dgraph.repository.CssRepository;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(path="/css")
public class CssController {
	
	@Autowired
	public CssRepository cssRepository;
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Csss guardados")
	public @ResponseBody Iterable<CssModelo> getAllCsss(){
		
		return cssRepository.findAll();
	}
	
	@GetMapping(path="/id/{id}")
	@ApiOperation(value = "Muestra información del Css solicitado (buscado por ident)")
	public @ResponseBody CssModelo getCssById(@PathVariable Integer id) {
		
		return cssRepository.findById(id).orElse(null);
	}
	
	@GetMapping(path="/nombre/{nombre}")
	@ApiOperation(value = "Muestra coincidencias de Css con el nombre solicitado")
	public @ResponseBody Iterable getCssByNombre(@PathVariable String nombre) {
		
		return cssRepository.findCssModeloByNombre(nombre);
	}
	
	@DeleteMapping(path="/delete/{ident}")
	@ApiOperation(value = "Elimina un Css de la base de datos (buscado por ident) y devuelve una confirmación de éxito o fallo")
	public @ResponseBody String deleteCss(@PathVariable Integer ident) {
		
		cssRepository.deleteById(ident);
	    return "Eliminado";
	}
	
	@PostMapping(path="/add") 
	@ApiOperation(value = "Añade un Contacto a la base de datos y devuelve una confirmación de éxito o fallo")
	public @ResponseBody String addCss (@RequestBody CssModelo cuerpo) {
			
		cssRepository.save(cuerpo);
		return "Guardado";
	}
	
	@PutMapping(path="/update/{ident}")
	@ApiOperation(value = "Actualiza un Css, búscando la coincidencia por ident y devuelve dicho Css")
	public @ResponseBody CssModelo updateCssModelo(@PathVariable Integer ident, 
												 @RequestBody CssModelo mihtmlModelo) {
		
		CssModelo htmlModelo = cssRepository.findById(ident).orElse(null);
		try {
			htmlModelo.setNombre(mihtmlModelo.getNombre());
			htmlModelo.setValor(mihtmlModelo.getValor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
										 
		cssRepository.save(htmlModelo);
		return cssRepository.findById(ident).orElse(null);
	}
	
	
}
