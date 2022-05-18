package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, Integer>{

}