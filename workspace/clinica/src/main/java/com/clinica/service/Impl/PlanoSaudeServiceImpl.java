package com.clinica.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.model.Entity.PlanoSaude;
import com.clinica.repository.PlanoSaudeRepository;
import com.clinica.service.PlanoSaudeService;

@Service
public class PlanoSaudeServiceImpl implements PlanoSaudeService {

	@Autowired
	private PlanoSaudeRepository planosaudeRepository;

	@Override
	public PlanoSaude findbyId(Long id) {

		Optional<PlanoSaude> planosaudeOptional = planosaudeRepository.findById(id);

		PlanoSaude planosaude = null;

		if (planosaudeOptional.isPresent()) {
			planosaude = planosaudeOptional.get();
		}
		return planosaude;
	}

	@Override
	public List<PlanoSaude> findAll() {
		return planosaudeRepository.findAll();
	}

	@Override
	public PlanoSaude save(PlanoSaude planosaude) {
		return planosaudeRepository.save(planosaude);
	}

	@Override
	public void delete(Long id) {
		planosaudeRepository.deleteById(id);

	}

	@Override
	public PlanoSaude update(PlanoSaude planosaude, Long id) {
		PlanoSaude planosaudeUpdate = findbyId(id);

		if (planosaudeUpdate != null) {
			planosaude.setId(id);
			return planosaudeRepository.save(planosaude);
		}

		return null;
	}





}

	

