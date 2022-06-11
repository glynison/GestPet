package com.gestpet.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gestpet.backend.DTO.ProdutoPostDTO;
import com.gestpet.backend.domain.Categoria;
import com.gestpet.backend.domain.Produto;
import com.gestpet.backend.domain.Produto;
import com.gestpet.backend.repository.CategoriaDAO;
import com.gestpet.backend.repository.ProdutoDAO;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    
    @Autowired
    private ProdutoDAO Dao;
    
//    @Autowired
//    private CategoriaDAO Cate;


    @GetMapping
    public List<Produto> listar() { 
    return  Dao.findAll();
    }

    @GetMapping("/{id}")	
    public Produto listarPorID(@PathVariable int id) {	
    return  Dao.findById(id);
    }
    
    
    @PostMapping
    public Produto Salvar(@RequestBody ProdutoPostDTO produtoDTO) { 
    	Produto p = new Produto();
    	p.setNome(produtoDTO.getNome());
    	p.setPreco(produtoDTO.getPreco());
    	p.setDescricao(produtoDTO.getDescricao());
    	
    	Categoria c = new Categoria();
    	c.setId(produtoDTO.getIdCategorias());
    	
    	p.setCategorias(c);
    	
 
    return Dao.save(p);
    }

    @DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePorId(@PathVariable int id) {
		Dao.deleteById(id);
	}
    
    @DeleteMapping
    public void Deletar(@RequestBody Produto produto) { 
    Dao.delete(produto);
    }
    
    @PutMapping
    public Produto alterarCategoria(@RequestBody Produto produto) { 
    return Dao.save(produto);
    }
}
