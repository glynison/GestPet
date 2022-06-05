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

import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.domain.Pedido;
import com.gestpet.backend.repository.CategoriaDAO;
import com.gestpet.backend.repository.ClienteDAO;
import com.gestpet.backend.repository.EnderecoDAO;
import com.gestpet.backend.repository.PedidoDAO;
import com.gestpet.backend.repository.ProdutoDAO;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    
    @Autowired
    private PedidoDAO Dao;
    

    @GetMapping
    public List<Pedido> listar() { 
    return  Dao.findAll();
    }

    @GetMapping("/{id}")	
    public Pedido listarPorID(@PathVariable int id) {	
    return  Dao.findById(id);
    }
    
    @PostMapping
    public Pedido Salvar(@RequestBody Pedido pedido) { 
    return Dao.save(pedido);
    }
    

    @DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePorId(@PathVariable int id) {
		Dao.deleteById(id);
	}
    
    @DeleteMapping
    public void Deletar(@RequestBody Pedido pedido) { 
    Dao.delete(pedido);
    }
    
    @PutMapping
    public Pedido Alterar(@RequestBody Pedido pedido) { 
    return Dao.save(pedido);
    }
}
