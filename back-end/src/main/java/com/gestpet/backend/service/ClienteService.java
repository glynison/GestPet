package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Cliente;
import com.gestpet.backend.repository.ClienteDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    public void criarCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteDAO.findAll();
    }

    public Optional<Cliente> listarPorId(Integer id) {
        return clienteDAO.findById(id);
    }

    public void deletarCliente(Integer id) {
        clienteDAO.deleteById(id);
    }   
}