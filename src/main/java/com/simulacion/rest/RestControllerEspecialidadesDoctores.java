package com.simulacion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulacion.entity.Especialidad;
import com.simulacion.implementaciones.EspecialidadServiceImpl;

@RestController
@RequestMapping("/especialidades")
@CrossOrigin(origins = "*")
public class RestControllerEspecialidadesDoctores {
	
	@Autowired
	EspecialidadServiceImpl especialidadService;
	
	@GetMapping
	ResponseEntity<List<Especialidad>> servirEspecialidades(){
		List<Especialidad> especialidades = especialidadService.listarEspecialidades();
		return ResponseEntity.ok(especialidades);
	}

}
