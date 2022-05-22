package com.gestpet.backend.controller;

import java.util.List;

import com.gestpet.backend.domain.Categoria;
import com.gestpet.backend.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping
    public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria) {
        service.criarCategoria(categoria);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarCategorias() {
        service.listarCategorias();
        return new ResponseEntity<List<Categoria>>(service.listarCategorias(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Void> listarPorID(@PathVariable("id") Integer id) {
        service.listarPorID(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCategoriaID(@PathVariable("id") Integer id) {
        service.deletarCategoriaID(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
