package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Endereco;
import com.gestpet.backend.repository.EnderecoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnderecoService {

    @Autowired
    private EnderecoDAO enderecoDAO;

    public void criarendereco(Endereco endereco) {
        enderecoDAO.save(endereco);
    }

    public List<Endereco> listarTodos() {
        return enderecoDAO.findAll();
    }

    public Optional<Endereco> listarPorId(Integer id) {
        return enderecoDAO.findById(id);
    }

    public void deletarendereco(Integer id) {
        enderecoDAO.deleteById(id);
    }   
}