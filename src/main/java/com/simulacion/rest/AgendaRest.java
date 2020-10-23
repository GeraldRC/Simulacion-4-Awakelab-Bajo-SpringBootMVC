package com.simulacion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulacion.entity.Agenda;
import com.simulacion.implementaciones.AgendaServiceImpl;

@RestController
@RequestMapping("/agendas")
public class AgendaRest {
	
	@Autowired
	private AgendaServiceImpl agendaService;
	
	@GetMapping
	ResponseEntity<List<Agenda>> servirEspecialidades(){
		List<Agenda> agendas = agendaService.listarAgendas();
		return ResponseEntity.ok(agendas);
	}

}
