package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.repository.PedidoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidoService {

    @Autowired
    private PedidoDAO pedidoDAO;

    public void criarPedido(Pedido Pedido) {
        pedidoDAO.save(Pedido);
    }

    public List<Pedido> listarTodos() {
        return pedidoDAO.findAll();
    }

    public Optional<Pedido> listarPorId(Integer id) {
        return pedidoDAO.findById(id);
    }

    public void deletarPedido(Integer id) {
        pedidoDAO.deleteById(id);
    }   
}