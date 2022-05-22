package com.gestpet.backend.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cate_id")
    private Integer id;
    
    @Column(name = "cate_nome")
    private String nome;
    
    @Column(name = "cate_produtos")
    @ManyToMany
    @JoinTable(name = "categorias_produtos",
        joinColumns = @JoinColumn(name = "cate_id"),
        inverseJoinColumns = @JoinColumn(name = "prod_id")
    )
    private List<Produto> produtos;
}
