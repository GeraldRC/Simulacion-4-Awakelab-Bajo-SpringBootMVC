package com.simulacion.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulacion.entity.Paciente;
import com.simulacion.repository.PacienteRepository;
import com.simulacion.service.PacienteService;


@Service
public class PacienteServiceImpl implements PacienteService{

	@Autowired
	PacienteRepository pacienteRepo;
	
	@Override
	public void registrarPaciente(Paciente paciente) {
		this.pacienteRepo.save(paciente);
		
	}

	@Override
	public List<Paciente> listarPacientes() {
		return this.pacienteRepo.findAll();
	}

	@Override
	public int generarIdPaciente() {
		List<Paciente> pacientes = pacienteRepo.findAll();
		  Integer ultimoPacienteId = 0;
		
		Optional<Paciente> ultimoidOptional =pacientes.stream().reduce((primero, segundo) -> segundo);
		
		 if (ultimoidOptional.isPresent()) {
			 ultimoPacienteId= ultimoidOptional.get().getIdPaciente();
		}
		
		int id = (ultimoPacienteId+1);
		
		return id;
	}

}
