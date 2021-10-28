package com.clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.clinica.model.Entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepositoryImplementation<Paciente, Long> {

}
