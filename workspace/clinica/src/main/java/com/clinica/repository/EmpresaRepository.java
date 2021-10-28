package com.clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.clinica.model.Entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepositoryImplementation<Empresa, Long> {

}
