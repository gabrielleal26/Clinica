package com.clinica.service;

import java.util.List;


import com.clinica.model.Entity.Proficional;


public interface ProficionalService {

	Proficional findbyId(Long id);

	List<Proficional> findAll();

	Proficional save(Proficional proficionais);

	void delete(Long id);

	Proficional update(Proficional proficionais, Long id);


}
