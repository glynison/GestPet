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

import com.gestpet.backend.domain.WebUser;
import com.gestpet.backend.domain.WebUser;
import com.gestpet.backend.domain.WebUser;
import com.gestpet.backend.domain.WebUser;
import com.gestpet.backend.domain.WebUser;
import com.gestpet.backend.repository.CategoriaDAO;
import com.gestpet.backend.repository.ClienteDAO;
import com.gestpet.backend.repository.EnderecoDAO;
import com.gestpet.backend.repository.WebUserDAO;
import com.gestpet.backend.repository.ProdutoDAO;

@RestController
@RequestMapping("/webuser")
public class WebUserController {

    
    @Autowired
    private WebUserDAO Dao;
    

    @GetMapping
    public List<WebUser> listar() { 
    return  Dao.findAll();
    }

    @GetMapping("/{id}")	
    public WebUser listarPorID(@PathVariable int id) {	
    return  Dao.findById(id);
    }
    
    @PostMapping
    public WebUser Salvar(@RequestBody WebUser webUser) { 
    return Dao.save(webUser);
    }
    

    @DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePorId(@PathVariable int id) {
		Dao.deleteById(id);
	}
    
    @DeleteMapping
    public void Deletar(@RequestBody WebUser webUser) { 
    Dao.delete(webUser);
    }
    
    @PutMapping
    public WebUser Alterar(@RequestBody WebUser webUser) { 
    return Dao.save(webUser);
    }
}
