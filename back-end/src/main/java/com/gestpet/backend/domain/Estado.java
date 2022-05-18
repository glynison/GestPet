package com.gestpet.backend.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "esta_id")
    private Integer id;
   
    @Column(name = "esta_nome")
    private String nome;
   
    @Column(name = "esta_cidades")
    private List<Cidade> cidades;
}
