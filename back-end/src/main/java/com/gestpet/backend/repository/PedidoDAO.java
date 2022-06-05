package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestpet.backend.domain.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {
	
	Pedido findById(int id);

}
