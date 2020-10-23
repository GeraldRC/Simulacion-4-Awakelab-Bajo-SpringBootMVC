package com.simulacion.DTO;

public class AgendaDTO{
	
	private String nombrePaciente;
	private String apellidoPaciente;
	private String rutPaciente;
	private Integer idDoctor;
	private String fecha;
	private String hora;
	
	
	public AgendaDTO() {

	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getApellidoPaciente() {
		return apellidoPaciente;
	}
	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}
	public String getRutPaciente() {
		return rutPaciente;
	}
	public void setRutPaciente(String rutPaciente) {
		this.rutPaciente = rutPaciente;
	}
	public Integer getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
