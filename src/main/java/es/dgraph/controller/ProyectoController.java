package es.dgraph.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.dgraph.model.HtmlModelo;
import es.dgraph.model.LibModelo;
import es.dgraph.model.MidwayModelo;
import es.dgraph.repository.HtmlRepository;
import es.dgraph.repository.LibRepository;
import es.dgraph.repository.MidwayRepository;
import es.dgraph.model.ScriptModelo;
import es.dgraph.repository.ScriptRepository;

import es.dgraph.model.CssModelo;
import es.dgraph.model.DatoModelo;
import es.dgraph.repository.CssRepository;
import es.dgraph.repository.DatoRepository;
import es.dgraph.model.ProyectoModelo;
import es.dgraph.repository.ProyectoRepository;
import io.swagger.annotations.ApiOperation;


@RestController
@CrossOrigin
@RequestMapping(path="/proyectos")
public class ProyectoController {
	
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
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Proyectoss guardados")
	public @ResponseBody Iterable<ProyectoModelo> getAllProyectos(){
		
		return proyectoRepository.findAll();
	}

	@PostMapping(path="/add")
	@ApiOperation(value = "Añade un Proyeto a la base de datos, devuelve una confirmación de éxito o fallo")
	public @ResponseBody String addProyecto(@RequestBody HashMap<String,HashMap<String, String>> cuerpo) {
		
		ProyectoModelo pro = new ProyectoModelo();
		//System.out.append("hddddddddddddddd");
		
		if(cuerpo.get("html") != null && !cuerpo.get("html").equals("")) {
			
			String html = (String) cuerpo.get("html").get("1");
			HtmlModelo mhtml = new HtmlModelo();
			mhtml.setValor(html);
			mhtml = htmlRepository.save(mhtml);
			pro.setModeloHtml(mhtml);
			
			if(cuerpo.get("css") != null) {
				String css = (String) cuerpo.get("css").get("1");
				CssModelo mcss = new CssModelo();
				mcss.setValor(css);
				mcss = cssRepository.save(mcss);
				pro.setModeloCss(mcss);
			}
			
			if(cuerpo.get("script") != null) {
				String script = (String) cuerpo.get("script").get("1");
				ScriptModelo mscript = new ScriptModelo();
				mscript.setValor(script);
				mscript = scriptRepository.save(mscript);
				pro.setModeloJs(mscript);
			}
			
			if(cuerpo.get("dato") != null && !cuerpo.get("dato").equals("[];")) {
				String dato = (String) cuerpo.get("dato").get("1");
				DatoModelo mdato = new DatoModelo();
				mdato.setValor(dato);
				mdato = datoRepository.save(mdato);
				pro.setModeloDato(mdato);
			}
			
			LibModelo libModelo = new LibModelo();
			ArrayList<LibModelo> importaciones = new ArrayList<LibModelo>();
			
			if(cuerpo.get("imports") != null) {
				
				HashMap<String, String> libs = cuerpo.get("imports");
				for(String lib : libs.keySet()) {
					libModelo = new LibModelo();
					libModelo = libRepository.findLibModeloByValor(libs.get(lib));
					if(libModelo != null) {
						importaciones.add(libModelo);
					}else {
						libModelo = new LibModelo();
						libModelo.setValor(libs.get(lib));
						libModelo = libRepository.save(libModelo);
						importaciones.add(libModelo);
					}
					
				}
			}
			
			pro = proyectoRepository.save(pro);
			for(LibModelo libm: importaciones) {
				
				MidwayModelo midModelo = new MidwayModelo();
				midModelo.setModeloLib(libm);
				midModelo.setModeloProyecto(pro);
				midRepository.save(midModelo);
			}
			
			
			return "Guardado.";
		}
		
		return "Fallo";
		
	}
	
	@DeleteMapping(path="/delete/{ident}")
	@ApiOperation(value = "Elimina un Proyecto de la base de datos (buscado por ident) y devuelve una confirmación de éxito o fallo")
	public @ResponseBody String deleteProyecto(@PathVariable Integer ident) {
		
		ProyectoModelo proyecto = proyectoRepository.findByIdent(ident);
		
		List<MidwayModelo> midway = new ArrayList<MidwayModelo>();
		midway = midRepository.findByModeloProyecto(proyecto);
		if(midway != null && !midway.isEmpty() ) {
			midRepository.deleteById(midway.get(0).getIdent());
		}
		
		proyectoRepository.deleteById(ident);
		
		// INUTIL POR EL CASCADE AÑADIDO EN EL MODELO (SALVO MIDWAY PARA EVITAR BORRAR ENTRADA EN t_lib)
	/*	List<MidwayModelo> midway = new ArrayList<MidwayModelo>();
		midway = midRepository.findByModeloProyecto(proyecto);
		if(midway != null && !midway.isEmpty() ) {
			midRepository.deleteById(midway.get(0).getIdent());
		}
		
		HtmlModelo html = new HtmlModelo();
		html = htmlRepository.findByIdent(proyecto.getModeloHtml().getIdent());
		if(html != null) {
			htmlRepository.deleteById(html.getIdent());
		}
		
		CssModelo css = new CssModelo();
		css = cssRepository.findByIdent(proyecto.getModeloCss().getIdent());
		if( css != null) {
			  cssRepository.deleteById(css.getIdent());
		}
		
		ScriptModelo script = new ScriptModelo();
		script = scriptRepository.findByIdent(proyecto.getModeloJs().getIdent());
		if(html != null) {
			scriptRepository.deleteById(script.getIdent());
		}
		
		DatoModelo dato = new DatoModelo();
		dato = datoRepository.findByIdent(proyecto.getModeloDato().getIdent());
		if(dato != null ) {
			datoRepository.deleteById(dato.getIdent());
		}
		
		proyectoRepository.deleteById(ident);*/
		
		return "Eliminado";
	}
	
	@PutMapping(path="/updateall/{ident}")
	@ApiOperation(value = "Añade un Proyeto a la base de datos, devuelve una confirmación de éxito o fallo")
	public @ResponseBody String updateProyectoAll(@PathVariable Integer ident,
			@RequestBody HashMap<String,HashMap<String, String>> cuerpo) {
		
		ProyectoModelo pro = proyectoRepository.findByIdent(ident);

		
		if(cuerpo.get("html") != null && !cuerpo.get("html").equals("")) {
			
			String html = (String) cuerpo.get("html").get("1");
			pro.getModeloHtml().setValor((html));
			
			if(cuerpo.get("css") != null) {
				String css = (String) cuerpo.get("css").get("1");
				pro.getModeloCss().setValor((css));
			}
			
			if(cuerpo.get("script") != null) {
				String script = (String) cuerpo.get("script").get("1");
				pro.getModeloJs().setValor((script));
			}
			
			if(cuerpo.get("dato") != null && !cuerpo.get("dato").equals("[];")) {
				String dato = (String) cuerpo.get("dato").get("1");
				pro.getModeloDato().setValor((dato));
			}
					
			pro = proyectoRepository.save(pro);
			
			return "Guardado.";
		}
		
		return "Fallo";
		
	}
	
	@PutMapping(path="/updatenombre/{ident}")
	@ApiOperation(value = "Actualiza un Proyecto, búscando la coincidencia por ident y devuelve dicho Proyecto")
	public @ResponseBody ProyectoModelo updateProyectoNombre(@PathVariable Integer ident,
			@RequestBody  HashMap<String, HashMap<String, String>> cuerpo) {
	
		ProyectoModelo pro = proyectoRepository.findByIdent(ident);		
			
		if(cuerpo.get("html").get("1") != null) {
			pro.setModeloHtml(htmlRepository.findById(Integer.parseInt(cuerpo.get("html").get("1"))).orElse(null));
		}
		
		if( cuerpo.get("css").get("1") != null) {	
			pro.setModeloCss(cssRepository.findById(Integer.parseInt(cuerpo.get("css").get("1"))).orElse(null));
		}
		
		if( cuerpo.get("script").get("1") != null) {
			pro.setModeloJs(scriptRepository.findById(Integer.parseInt(cuerpo.get("script").get("1"))).orElse(null));
		}
		
		if( cuerpo.get("dato").get("1") != null) {		
			pro.setModeloDato(datoRepository.findById(Integer.parseInt(cuerpo.get("dato").get("1"))).orElse(null));
		}
		
		// Hace que no funcione el compile al importar proyecto (probablemente por el orden en que carga los scripts)
	/*	if( cuerpo.get("librerias").size() > 0) {		
			ArrayList<String> libs = new ArrayList<String>();
			for(String nombre : cuerpo.get("librerias").keySet()){
				libs.add(cuerpo.get("librerias").get(nombre));
			}
			
			for(LibModelo lib : pro.getLibrerias()) {
				String val = lib.getValor();
				if(!libs.contains(val)) {
					LibModelo busqueda = libRepository.findLibModeloByValor(val);
					if(busqueda == null) {
						busqueda = new LibModelo();
						busqueda.setValor(val);
						libRepository.save(busqueda);	
					}
					
					MidwayModelo mid = new MidwayModelo();
					mid.setModeloLib(busqueda);
					mid.setModeloProyecto(pro);
					
					midRepository.save(mid);
					
				}
			}
		}*/
			
		
		pro.setNombre(cuerpo.get("nombre").get("1"));
							
		proyectoRepository.save(pro);
		return proyectoRepository.findByIdent(ident);

	}
	
	
}	
