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

import com.gestpet.backend.DTO.ClientePostDTO;
import com.gestpet.backend.domain.Cliente;
import com.gestpet.backend.domain.Endereco;
import com.gestpet.backend.domain.Cliente;
import com.gestpet.backend.domain.Cliente;
import com.gestpet.backend.repository.CategoriaDAO;
import com.gestpet.backend.repository.ClienteDAO;
import com.gestpet.backend.repository.EnderecoDAO;
import com.gestpet.backend.repository.ProdutoDAO;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    
    @Autowired
    private ClienteDAO Dao;
    
    @Autowired
    private EnderecoDAO DaoEnd;
    

    @GetMapping
    public List<Cliente> listar() { 
    return  Dao.findAll();
    }

    @GetMapping("/{id}")	
    public Cliente listarPorID(@PathVariable int id) {	
    return  Dao.findById(id);
    }
    
    @PostMapping
    public Cliente Salvar(@RequestBody ClientePostDTO clienteDTO) {
    	
    	Cliente c = new Cliente();
    	c.setNome(clienteDTO.getNome());
    	c.setCpf(clienteDTO.getCpf());
    	c.setEmail(clienteDTO.getEmail());
    	c.setTelefone(clienteDTO.getTelefone());
    	
    	Endereco e = new Endereco();
    	e.setId(clienteDTO.getIdEndereco());
    	e.setLogradouro(clienteDTO.getLogradouro());
    	e.setNumero(clienteDTO.getNumero());
    	e.setComplemento(clienteDTO.getComplemento());
    	e.setBairro(clienteDTO.getBairro());
    	e.setCep(clienteDTO.getCep());
    	e.setCidade(clienteDTO.getCidade());
    	e.setEstado(clienteDTO.getEstado());
    	DaoEnd.save(e);
    	
    	c.setEndereco(e);
    	
    	
    return Dao.save(c);
    }
    

    @DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePorId(@PathVariable int id) {
		Dao.deleteById(id);
	}
    
    @DeleteMapping
    public void Deletar(@RequestBody Cliente cliente) { 
    Dao.delete(cliente);
    }
    
    @PutMapping
    public Cliente Alterar(@RequestBody Cliente cliente) { 
    return Dao.save(cliente);
    }
}
