package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestpet.backend.domain.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{
	
	Categoria findById(int id);

}
