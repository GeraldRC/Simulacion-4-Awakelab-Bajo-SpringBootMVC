package com.simulacion.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DOCTORES")
public class Doctor {

	@Id
	@Column(name = "IDDOCTOR")
	private Integer idDoctor;
	
	@Column(name = "RUTDOCTOR")
	private String rutDoctor;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "idespecialidad")
	private Especialidad especialidad;
	
	public Doctor() {
		super();
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getRutDoctor() {
		return rutDoctor;
	}

	public void setRutDoctor(String rutDoctor) {
		this.rutDoctor = rutDoctor;
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

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	
}
