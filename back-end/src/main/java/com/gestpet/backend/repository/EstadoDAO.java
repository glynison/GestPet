package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstadoDAO extends JpaRepository<Estado, Integer>{

}