package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer>{
    
}
