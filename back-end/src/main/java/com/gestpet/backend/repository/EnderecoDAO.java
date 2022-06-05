package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestpet.backend.domain.Endereco;

public interface EnderecoDAO extends JpaRepository<Endereco, Integer> {
	
	Endereco findById(int id);

}
