package com.simulacion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "AGENDAS")
public class Agenda {
	
	@ManyToOne
	@JoinColumn(name = "IDPACIENTE")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "IDDOCTOR")
	private Doctor doctor;
	
	@Id
	@Column(name = "IDAGENDA")
	private Integer idAgenda;
	
	@Column(name = "FECHA")
	private String fecha;
	
	@Column(name = "HORADESDE")
	private String horaDesde;
	
	@Column(name = "DURACION")
	private Integer duracion;

	
	public Agenda() {
		
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Integer getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraDesde() {
		return horaDesde;
	}

	public void setHoraDesde(String horaDesde) {
		this.horaDesde = horaDesde;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	

}
