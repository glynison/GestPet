package com.gestpet.backend.service;

import java.util.List;
import java.util.Optional;

import com.gestpet.backend.domain.Produto;
import com.gestpet.backend.repository.ProdutoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService{

    @Autowired
    private ProdutoDAO produtoDAO;

  public void criarProduto(Produto produto) {
        produtoDAO.save(produto);
    }

    public List<Produto> listarTodos() {
        return produtoDAO.findAll();
    }

    public Optional<Produto> listarPorId(Integer id) {
        return produtoDAO.findById(id);
    }

    public void deletarCliente(Integer id) {
        produtoDAO.deleteById(id);
    }   


}