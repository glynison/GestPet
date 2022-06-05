package com.gestpet.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestpet.backend.domain.Categoria;
import com.gestpet.backend.repository.CategoriaRepository;

	
	@RestController
	@RequestMapping("/categoria")
	public class CategoriaController {


	    
	    @Autowired
	    private CategoriaRepository Dao;


	    @GetMapping
	    public List<Categoria> listarCategorias() { 
	    return  Dao.findAll();
	    }

	    @GetMapping("/{id}")
	    public Categoria listarPorID(@PathVariable("id") Long id) {	
	    return  Dao.findById(id);
	    }
	    
	    @PostMapping
	    public Categoria criarCategoria(@RequestBody Categoria categoria) { 
	    return Dao.save(categoria);
	    }

//	    @DeleteMapping("/{id}")
//	    public Void deletarCategoriaID(@PathVariable("id") Long id) {
//	        Dao.delete()
//	        return new ResponseEntity<Void>(HttpStatus.OK);
//	    }

	}

