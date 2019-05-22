package es.dgraph.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.dgraph.model.HtmlModelo;
import es.dgraph.repository.HtmlRepository;
import es.dgraph.model.ScriptModelo;
import es.dgraph.repository.ScriptRepository;
import es.dgraph.model.CssModelo;
import es.dgraph.model.DatoModelo;
import es.dgraph.repository.CssRepository;
import es.dgraph.repository.DatoRepository;
import es.dgraph.model.ProyectoModelo;
import es.dgraph.repository.ProyectoRepository;
import io.swagger.annotations.ApiOperation;


@Controller
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
	
	@GetMapping(path="/all")
	@ApiOperation(value = "Muestra todos los Proyectoss guardados")
	public @ResponseBody Iterable<ProyectoModelo> getAllProyectos(){
		
		return proyectoRepository.findAll();
	}

	@PostMapping(path="/add")
	@ApiOperation(value = "Añade un Proyeto a la base de datos, devuelve una confirmación de éxito o fallo")
	public @ResponseBody String addModulo(@RequestBody HashMap<String,String> cuerpo) {
		
		ProyectoModelo pro = new ProyectoModelo();
		System.out.append("hddddddddddddddd");
		
		if(cuerpo.get("html") != null && !cuerpo.get("html").equals("")) {
			
			String html = cuerpo.get("html");
			HtmlModelo mhtml = new HtmlModelo();
			mhtml.setValor(html);
			mhtml = htmlRepository.save(mhtml);
			//mhtml = htmlRepository.findHtmlModeloByValor(html);
			pro.setModeloHtml(mhtml);
			
			if(cuerpo.get("css") != null) {
				String css = cuerpo.get("css");
				CssModelo mcss = new CssModelo();
				mcss.setValor(css);
				mcss = cssRepository.save(mcss);
				//mcss = cssRepository.findCssModeloByValor(css);
				pro.setModeloCss(mcss);
			}
			
			if(cuerpo.get("script") != null) {
				String script = cuerpo.get("script");
				ScriptModelo mscript = new ScriptModelo();
				mscript.setValor(script);
				mscript = scriptRepository.save(mscript);
				//mscript = scriptRepository.findScriptModeloByValor(script);
				pro.setModeloJs(mscript);
			}
			
			if(cuerpo.get("dato") != null) {
				String dato = cuerpo.get("dato");
				DatoModelo mdato = new DatoModelo();
				mdato.setValor(dato);
				mdato = datoRepository.save(mdato);
				//mdato = datoRepository.findDatoModeloByValor(dato);
				pro.setModeloDato(mdato);
			}
			//proyectoRepository.save(pro);
			return "Guardado.";
		}
		
		return "Fallo";
		
	}
	
	
}	
