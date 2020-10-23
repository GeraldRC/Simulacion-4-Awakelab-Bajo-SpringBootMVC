package com.simulacion.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulacion.entity.Agenda;
import com.simulacion.repository.AgendaRepository;
import com.simulacion.service.AgendaService;


@Service
public class AgendaServiceImpl implements AgendaService{
	
	@Autowired
	AgendaRepository agendaRepo;

	@Override
	public List<Agenda> listarAgendas() {
		return this.agendaRepo.findAll();
	}

	@Override
	public void IngresarAgenda(Agenda agenda) {
		this.agendaRepo.save(agenda);
	}

	@Override
	public void eliminarAgenda(Integer id) {
		this.agendaRepo.deleteById(id);
		
	}

	@Override
	public void editarAgenda(Agenda agenda) {
		this.agendaRepo.save(agenda);
	
	}

	@Override
	public int generarAgendaId() {
		List<Agenda> agendas = agendaRepo.findAll();
		  Integer ultimoIdAgenda = 0;
		
		Optional<Agenda> ultimoidOptional =agendas.stream().reduce((primero, segundo) -> segundo);
		
		 if (ultimoidOptional.isPresent()) {
			 ultimoIdAgenda= ultimoidOptional.get().getIdAgenda();
		}
		
		int id = (ultimoIdAgenda+1);
		
		return id;
	}

}
