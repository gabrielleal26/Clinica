package com.clinica.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.model.Entity.Paciente;
import com.clinica.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private PacienteService pacientesService;
	
	@GetMapping("{id}")
	public Paciente buscaPorId(@PathVariable Long id) {
		return pacientesService.findbyId(id);
	}
	
	@GetMapping
	public List<Paciente> list(){
		return pacientesService.findAll();
	}
	
	@PostMapping
	public Paciente save(@RequestBody Paciente pacientes) {
		return pacientesService.save(pacientes);
	}
	
	@PutMapping("{id}")
	public Paciente update(@RequestBody  Paciente pacientes, @PathVariable Long id) {
		return pacientesService.update(pacientes, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		pacientesService.delete(id);
	}
	
	

}
