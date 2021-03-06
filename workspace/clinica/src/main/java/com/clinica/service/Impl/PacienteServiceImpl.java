package com.clinica.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.model.Entity.Paciente;
import com.clinica.repository.PacienteRepository;
import com.clinica.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository pacientesRepository;

	@Override
	public Paciente findbyId(Long id) {

		Optional<Paciente> pacienteOptional = pacientesRepository.findById(id);

		Paciente pacientes = null;

		if (pacienteOptional.isPresent()) {
			pacientes = pacienteOptional.get();
		}
		return pacientes;

	}

	@Override
	public List<Paciente> findAll() {
		return pacientesRepository.findAll();
	}

	@Override
	public Paciente save(Paciente pacientes) {
		return pacientesRepository.save(pacientes);
	}

	@Override
	public void delete(Long id) {
		pacientesRepository.deleteById(id);


	}

	@Override
	public Paciente update(Paciente pacientes, Long id) {

		Paciente pacienteUpdate = findbyId(id);

		if (pacienteUpdate != null) {
			pacientes.setId(id);
			return pacientesRepository.save(pacientes);
		}

		return null;
	}

}

	

