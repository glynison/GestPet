package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}