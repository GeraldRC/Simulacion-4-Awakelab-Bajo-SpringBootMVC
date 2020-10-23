package com.simulacion.service;

import java.util.List;

import com.simulacion.entity.Paciente;

public interface PacienteService {
	
	void registrarPaciente(Paciente paciente);
	List<Paciente> listarPacientes();
	public int generarIdPaciente();
	

}
