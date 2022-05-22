package com.gestpet.backend.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id", nullable = false)
    private Integer id;

    @Column(name = "prod_nome", nullable = false)
    private String nome;
    
    @Column(name = "prod_preco", nullable = false)
    private Double preco;
    
    @Column(name = "prod_categoria", nullable = false)
    @ManyToMany(mappedBy = "produtos")
    private List<Categoria> categorias;
    

    @Column(name = "prod_itens", nullable = false)
    @ManyToMany(mappedBy = "itens")
    private List<Pedido> itens;
}
