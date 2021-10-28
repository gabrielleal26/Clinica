package com.clinica.service;

import java.util.List;

import com.clinica.model.Entity.Filial;



public interface FilialService {

	Filial findbyId(Long id);

	List<Filial> findAll();

	Filial save(Filial filiais);

	void delete(Long id);

	Filial update(Filial filais, Long id);


}
