package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CidadeDAO extends JpaRepository<Cidade, Integer>{

}