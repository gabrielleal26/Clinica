package com.clinica.service;

import java.util.List;


import com.clinica.model.Entity.Paciente;


public interface PacienteService {
	
	Paciente findbyId(Long id);

	List<Paciente> findAll();

	Paciente save(Paciente pacientes);

	void delete(Long id);

	Paciente update(Paciente pacientes, Long id);
	
	
}
