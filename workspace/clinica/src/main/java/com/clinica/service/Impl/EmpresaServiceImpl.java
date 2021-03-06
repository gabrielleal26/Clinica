package com.clinica.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.model.Entity.Empresa;
import com.clinica.repository.EmpresaRepository;
import com.clinica.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements  EmpresaService{

	@Autowired
	private EmpresaRepository empresasRepository;
	
	
	@Override
	public Empresa findbyId(Long id) {
		
		Optional<Empresa> empresaOptional = empresasRepository.findById(id);
		
		Empresa empresas = null;
		
		if (empresaOptional.isPresent()) {
			empresas = empresaOptional.get();
		}
		return empresas;
	
	}

	@Override
	public List<Empresa> findAll() {
		
		return empresasRepository.findAll();
	}

	@Override
	public Empresa save(Empresa empresas) {
		
		return empresasRepository.save(empresas);
	}

	@Override
	public void delete(Long id) {
		
		empresasRepository.deleteById(id);
		
		
	}

	@Override
	public Empresa update(Empresa empresas, Long id) {
	Empresa empresaUpdate = findbyId(id);
		
		if (empresaUpdate != null) {
			empresas.setId(id);
			return empresasRepository.save(empresas);
		}
		
		return null;
	}

}
