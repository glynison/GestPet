package com.gestpet.backend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cida_id")
    private Integer id;

    @Column(name = "cida_nome")
    private String nome;
    
    @Column(name = "cida_estado")
    @ManyToOne
    @JoinColumn(name = "esta_id", nullable = false)
    private Estado estado;
}
