package com.clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.clinica.model.Entity.Proficional;

@Repository
public interface ProficionalRepository extends JpaRepositoryImplementation<Proficional, Long> {

}
