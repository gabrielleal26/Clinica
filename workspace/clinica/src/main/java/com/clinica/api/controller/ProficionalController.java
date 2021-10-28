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

import com.clinica.model.Entity.Proficional;
import com.clinica.service.ProficionalService;

@RestController
@RequestMapping("/proficionais")
public class ProficionalController {
	
	@Autowired
	private ProficionalService proficionaisService;
	
	@GetMapping("{id}")
	public Proficional buscaPorId(@PathVariable Long id) {
		return proficionaisService.findbyId(id);
	}
	
	@GetMapping
	public List<Proficional> list(){
		return proficionaisService.findAll();
	}
	
	@PostMapping
	public Proficional save(@RequestBody Proficional proficionais) {
		return proficionaisService.save(proficionais);
	}
	
	@PutMapping("{id}")
	public Proficional update(@RequestBody  Proficional proficionais, @PathVariable Long id) {
		return proficionaisService.update(proficionais, id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		proficionaisService.delete(id);
	}
	
	

}
