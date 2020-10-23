package com.simulacion.service;

import java.util.List;

import com.simulacion.entity.Agenda;

public interface AgendaService {

	List<Agenda> listarAgendas();
	void IngresarAgenda(Agenda agenda);
	void eliminarAgenda(Integer id);
	void editarAgenda(Agenda agenda);
	int generarAgendaId();
}
