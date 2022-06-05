package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestpet.backend.domain.ItemPedido;

public interface ItemPedidoDAO extends JpaRepository<ItemPedido, Integer> {
	
	ItemPedido findById(int id);

}
