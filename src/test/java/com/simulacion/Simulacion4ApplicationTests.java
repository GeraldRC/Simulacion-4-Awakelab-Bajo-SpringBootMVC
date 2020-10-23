package com.simulacion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simulacion.service.AgendaService;

@SpringBootTest
class Simulacion4ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private AgendaService service;
	
	@Test
	public void pruebas() {
		int idGenerado = service.generarAgendaId();
		System.out.println(idGenerado);
	}

}
