package com.gestpet.backend.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
    @ManyToMany
    @JoinTable(
        name = "produto_categoria",
        joinColumns = @JoinColumn(name = "prod_id"),
        inverseJoinColumns = @JoinColumn(name = "cate_id")
    )
    private List<Categoria> categorias;
    
    @Column(name = "prod_pedido", nullable = false)
    private List<Pedido> pedidos;
}
