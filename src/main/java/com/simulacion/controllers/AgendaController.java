package com.simulacion.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simulacion.DTO.AgendaDTO;
import com.simulacion.entity.Agenda;
import com.simulacion.entity.Paciente;
import com.simulacion.implementaciones.AgendaServiceImpl;
import com.simulacion.implementaciones.DoctorServiceImpl;
import com.simulacion.implementaciones.PacienteServiceImpl;

@Controller
@RequestMapping("/")
public class AgendaController {
	
	@Autowired
	private AgendaServiceImpl agendaServiceImpl;
	
	@Autowired
	private PacienteServiceImpl pacienteService;
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@GetMapping("listado")
	public String litadoDeAgendas(Model model) {
		model.addAttribute("agendas",agendaServiceImpl.listarAgendas());
		return "listado";
	}
	
	@RequestMapping("eliminar/{id}")
	public String eliminarAgendas(@PathVariable Integer id,RedirectAttributes attributes) {
		agendaServiceImpl.eliminarAgenda(id);
		attributes.addFlashAttribute("confirmado",true);
		return "redirect:/listado";
	}
	
	@GetMapping("reserva")
	public String reservaDeAgendas(Model model) {
		model.addAttribute("agenda",new AgendaDTO());
		return "reserva";
	}
	
	@PostMapping("reserva")
	public String agendarReserva(@RequestParam Map<String,String> todos) {
		//Se crean instancias de los objetos a ocupar
		Paciente paciente = new Paciente();
		Agenda agenda = new Agenda();
		
		// se rescatan los datos para agendar y se conviertes a sus respectivos tipos de datos
		String nombrePaciente = todos.get("nombre");
		String apellidoPaciente = todos.get("apellido");
		String rutPaciente = todos.get("rut");
		Integer idDoctor = Integer.parseInt(todos.get("doctor"));
		String fecha = todos.get("fecha");
		String hora = todos.get("hora");
		
		// se setea el objeto paciente
		paciente.setIdPaciente(pacienteService.generarIdPaciente());
		paciente.setNombre(nombrePaciente);
		paciente.setApellido(apellidoPaciente);
		paciente.setRutPaciente(rutPaciente);
		// se registra el paciente a travez del service
		pacienteService.registrarPaciente(paciente);
		
		//se setea el objeto agenda
		agenda.setIdAgenda(agendaServiceImpl.generarAgendaId());
		agenda.setDoctor(doctorService.buscarDoctorPorId(idDoctor));
		agenda.setPaciente(paciente);
		agenda.setFecha(fecha);
		agenda.setHoraDesde(hora);
		agenda.setDuracion(15);
		
		// se registra la agenda 
		agendaServiceImpl.IngresarAgenda(agenda);
		
		// se retorna al listado de agendas
		return"redirect:/listado";
	}
	
	
	
}
