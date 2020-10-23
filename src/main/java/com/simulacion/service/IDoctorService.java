package com.simulacion.service;

import java.util.List;

import com.simulacion.entity.Doctor;

public interface IDoctorService {
	
	List<Doctor> listarDoctores();
	void registrarDoctor(Doctor doctor);
	void modificarDoctor(Doctor doctor);
	boolean eliminarDocotor(Integer id);
	Doctor buscarDoctorPorId(Integer id);

}
