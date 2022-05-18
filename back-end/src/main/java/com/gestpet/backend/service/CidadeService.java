package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Cidade;
import com.gestpet.backend.repository.CidadeDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CidadeService {

    @Autowired
    private CidadeDAO cidadeDAO;

    public void criarCidade(Cidade Cidade) {
        cidadeDAO.save(Cidade);
    }

    public List<Cidade> listarTodos() {
        return cidadeDAO.findAll();
    }

    public Optional<Cidade> listarPorId(Integer id) {
        return cidadeDAO.findById(id);
    }

    public void deletarCidade(Integer id) {
        cidadeDAO.deleteById(id);
    }   
}