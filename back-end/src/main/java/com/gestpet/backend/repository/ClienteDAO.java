package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestpet.backend.domain.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
	
	Cliente findById(int id);

}
