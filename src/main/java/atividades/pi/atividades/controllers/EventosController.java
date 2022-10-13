package atividades.pi.atividades.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import atividades.pi.atividades.models.Evento;
import atividades.pi.atividades.repositories.EventoRepository;

@Controller
public class EventosController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping ("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "evento-adicionado";
	}
	
	
	
}
