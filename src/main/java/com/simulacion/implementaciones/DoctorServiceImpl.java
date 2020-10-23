package com.simulacion.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulacion.entity.Doctor;
import com.simulacion.repository.IDoctorRepository;
import com.simulacion.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepository repo;

	@Override
	public List<Doctor> listarDoctores() {
		return repo.findAll();
	}

	@Override
	public void registrarDoctor(Doctor doctor) {
		repo.save(doctor);
	}

	@Override
	public void modificarDoctor(Doctor doctor) {
		repo.save(doctor);

	}

	@Override
	public boolean eliminarDocotor(Integer id) {
		boolean res= false;
		Optional<Doctor> op = repo.findById(id);
		
		if (op.isPresent()) {
			repo.deleteById(op.get().getIdDoctor());
			res = true;
		}
		
		return res;
	}

	@Override
	public Doctor buscarDoctorPorId(Integer id) {
		Optional<Doctor> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Doctor(); 
	}

}
