package atividades.pi.atividades.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import atividades.pi.atividades.models.Evento;

@Controller
public class EventosController {
	
	@RequestMapping ("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		
		return "evento-adicionado";
	}
	
}
