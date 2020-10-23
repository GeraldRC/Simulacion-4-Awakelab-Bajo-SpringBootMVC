package com.simulacion.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PACIENTES")
public class Paciente {

	@Id
	@Column(name = "IDPACIENTE")
	private Integer idPaciente;
	
	@Column(name = "RUTPACIENTE")
	private String rutPaciente;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	public Paciente() {
		
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getRutPaciente() {
		return rutPaciente;
	}

	public void setRutPaciente(String rutPaciente) {
		this.rutPaciente = rutPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	
}
