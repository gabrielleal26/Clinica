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

import com.clinica.model.Entity.PlanoSaude;
import com.clinica.service.PlanoSaudeService;

@RestController
@RequestMapping("/planosaude")
public class PlanoSaudeController {

	@Autowired
	private PlanoSaudeService planosaudeService;

	@GetMapping("{id}")
	public PlanoSaude buscaPorId(@PathVariable Long id) {
		return planosaudeService.findbyId(id);
	}

	@GetMapping
	public List<PlanoSaude> list(){
		return planosaudeService.findAll();
	}

	@PostMapping
	public PlanoSaude save(@RequestBody PlanoSaude planosaude) {
		return planosaudeService.save(planosaude);
	}

	@PutMapping("{id}")
	public PlanoSaude update(@RequestBody  PlanoSaude planosaude, @PathVariable Long id) {
		return planosaudeService.update(planosaude, id);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		planosaudeService.delete(id);
	}



}
