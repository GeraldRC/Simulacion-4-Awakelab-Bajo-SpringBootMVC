package com.simulacion.implementaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulacion.entity.Especialidad;
import com.simulacion.repository.EspecialidadRepository;
import com.simulacion.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {
	
	@Autowired
	EspecialidadRepository especialidadRepo;

	@Override
	public List<Especialidad> listarEspecialidades() {
		return this.especialidadRepo.findAll();
	}

}
