package com.clinica.service;

import java.util.List;

import com.clinica.model.Entity.PlanoSaude;





public interface PlanoSaudeService {
	
	PlanoSaude findbyId(Long id);
	List<PlanoSaude> findAll();

	PlanoSaude save(PlanoSaude planosaude);

	void delete(Long id);

	PlanoSaude update(PlanoSaude planosaude, Long id);
	
	
}
