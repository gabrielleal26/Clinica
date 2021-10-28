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

import com.clinica.model.Entity.Filial;
import com.clinica.service.FilialService;

@RestController
@RequestMapping("/filiais")
public class FilialController {
	
	@Autowired
	private FilialService filiaisService;
	
	@GetMapping("{id}")
	public Filial buscaPorId(@PathVariable Long id) {
		return filiaisService.findbyId(id);
	}
	
	@GetMapping
	public List<Filial> list(){
		return filiaisService.findAll();
	}
	
	@PostMapping
	public Filial save(@RequestBody Filial filiais) {
		return filiaisService.save(filiais);
	}
	
	@PutMapping("{id}")
	public Filial update(@RequestBody  Filial filiais, @PathVariable Long id) {
		return filiaisService.update(filiais, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		filiaisService.delete(id);
	}
	
	

}
