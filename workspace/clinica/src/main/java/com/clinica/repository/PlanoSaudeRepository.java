package com.clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.clinica.model.Entity.PlanoSaude;

@Repository
public interface PlanoSaudeRepository extends JpaRepositoryImplementation<PlanoSaude, Long> {

}
