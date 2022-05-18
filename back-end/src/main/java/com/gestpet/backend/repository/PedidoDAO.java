package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PedidoDAO extends JpaRepository<Pedido, Integer>{
    
    
}
