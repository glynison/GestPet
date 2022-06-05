package com.gestpet.backend.controller;

import java.util.List;

import com.gestpet.backend.domain.Categoria;
import com.gestpet.backend.repository.CategoriaDAO;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    
    @Autowired
    private CategoriaDAO Dao;


    @GetMapping
    public List<Categoria> listarCategorias() { 
    return  Dao.findAll();
    }

    @GetMapping("/{id}")
    public Categoria listarPorID(@PathVariable int id) {	
    return  Dao.findById(id);
    }
    
    @PostMapping
    public Categoria Salvar(@RequestBody Categoria categoria) { 
    return Dao.save(categoria);
    }

    @DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePorId(@PathVariable int id) {
		Dao.deleteById(id);
	}
    
    @DeleteMapping
    public void Deletar(@RequestBody Categoria categoria) { 
    Dao.delete(categoria);
    }
    
    @PutMapping
    public Categoria alterarCategoria(@RequestBody Categoria categoria) { 
    return Dao.save(categoria);
    }
}
