package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestpet.backend.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	Categoria findById( id);

}
