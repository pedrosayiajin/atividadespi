package atividades.pi.atividades.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import atividades.pi.atividades.models.Evento;
import atividades.pi.atividades.repositories.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventosController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping ("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@GetMapping
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "evento-adicionado";
	}
	
	@GetMapping("/eventos")
	public ModelAndView listar(){
		
		List<Evento> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("/eventos/form");
		mv.addObject("eventos", eventos);
		return mv;
	}
	
	
}
