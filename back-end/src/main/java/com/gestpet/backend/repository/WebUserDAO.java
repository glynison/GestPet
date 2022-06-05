package com.gestpet.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.domain.WebUser;

public interface WebUserDAO extends JpaRepository<WebUser, Integer> {
	
	WebUser findById(int id);

}
