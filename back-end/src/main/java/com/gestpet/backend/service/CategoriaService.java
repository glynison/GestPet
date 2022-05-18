package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Categoria;
import com.gestpet.backend.repository.CategoriaDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaDAO categoriaDAO;

    public void criarCategoria(Categoria categoria) {
        categoriaDAO.save(categoria);
    }

    public List<Categoria> listarTodos() {
        return categoriaDAO.findAll();
    }

    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaDAO.findById(id);
    }

    public void deletarCategoria(Integer id) {
        categoriaDAO.deleteById(id);
    }   
}