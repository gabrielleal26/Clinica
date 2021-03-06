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

import com.clinica.model.Entity.Empresa;
import com.clinica.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresasService;
	
	@GetMapping("{id}")
	public Empresa buscaPorId(@PathVariable Long id) {
		return empresasService.findbyId(id);
	}
	
	@GetMapping
	public List<Empresa> list(){
		return empresasService.findAll();
	}
	
	@PostMapping
	public Empresa save(@RequestBody Empresa empresas) {
		return empresasService.save(empresas);
	}
	
	@PutMapping("{id}")
	public Empresa update(@RequestBody  Empresa empresas, @PathVariable Long id) {
		return empresasService.update(empresas, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		empresasService.delete(id);
	}
	
	

}
