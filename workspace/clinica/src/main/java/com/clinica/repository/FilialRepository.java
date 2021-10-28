package com.clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.clinica.model.Entity.Filial;

@Repository
public interface FilialRepository extends JpaRepositoryImplementation<Filial, Long> {

}
