package com.simulacion.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ESPECIALIDADES")
public class Especialidad {


	@Id
	@Column(name = "IDESPECIALIDAD")
	private Integer idEspecialidad;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	
	@OneToMany(mappedBy = "especialidad")
    private List<Doctor> doctores;
	

	public Especialidad() {

	}

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Doctor> getDoctores() {
		return doctores;
	}

	public void setDoctores(List<Doctor> doctores) {
		this.doctores = doctores;
	}
	
	

}
