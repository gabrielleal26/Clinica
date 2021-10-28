package com.clinica.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.model.Entity.Proficional;
import com.clinica.repository.ProficionalRepository;
import com.clinica.service.ProficionalService;

@Service
public class ProficionalServiceImpl implements ProficionalService {

	@Autowired
	private ProficionalRepository proficionaisRepository;

	@Override
	public Proficional findbyId(Long id) {

		Optional<Proficional> proficionalOptional = proficionaisRepository.findById(id);

		Proficional proficionais = null;

		if (proficionalOptional.isPresent()) {
			proficionais = proficionalOptional.get();
		}
		return proficionais;

	}

	@Override
	public List<Proficional> findAll() {
		return proficionaisRepository.findAll();
	}

	@Override
	public Proficional save(Proficional proficionais) {
		return proficionaisRepository.save(proficionais);
	}

	@Override
	public void delete(Long id) {
		proficionaisRepository.deleteById(id);


	}

	@Override
	public Proficional update(Proficional proficionais, Long id) {

		Proficional proficionalUpdate = findbyId(id);

		if (proficionalUpdate != null) {
			proficionais.setId(id);
			return proficionaisRepository.save(proficionais);
		}

		return null;
	}

}



