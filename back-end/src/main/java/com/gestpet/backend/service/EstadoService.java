package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Estado;
import com.gestpet.backend.repository.EstadoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstadoService {

    @Autowired
    private EstadoDAO estadoDAO;

    public void criarEstado(Estado estado) {
        estadoDAO.save(estado);
    }

    public List<Estado> listarTodos() {
        return estadoDAO.findAll();
    }

    public Optional<Estado> listarPorId(Integer id) {
        return estadoDAO.findById(id);
    }

    public void deletarEstado(Integer id) {
        estadoDAO.deleteById(id);
    }   
}