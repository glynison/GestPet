package com.gestpet.backend.repository;

import com.gestpet.backend.domain.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PagamentoDAO extends JpaRepository<Pagamento, Integer>{

}