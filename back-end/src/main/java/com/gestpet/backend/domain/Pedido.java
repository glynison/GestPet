package com.gestpet.backend.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedi_id")
    private Integer id;
    
    @Column(name = "pedi_instante")
    private LocalDate instante;
    
    @Column(name = "pedi_itens")
    @ManyToMany
    @JoinTable(name = "pedidos_produtos",
        joinColumns =  @JoinColumn(name = "pedi_id"),
        inverseJoinColumns = @JoinColumn(name = "prod_id")
    )
    private List<Produto> itens;
    
    @Column(name = "pedi_cliente")
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Cliente cliente;
    
    @Column(name = "pedi_pagamento")
    private Pagamento pagamento;
    
    @Column(name = "pedi_endEntrega")
    private Endereco enderecoEntrega;
}
