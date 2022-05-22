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
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ende_id", nullable = false)
    private Integer id;

    @Column(name = "ende_logradouro")
    private String logradouro;
    
    @Column(name = "ende_numero")
    private String numero;
    
    @Column(name = "ende_complemento")
    private String complemento;
    
    @Column(name = "ende_bairro")
    private String bairro;
    
    @Column(name = "ende_cep")
    private String cep;
    
    @Column(name = "ende_cidade")
    private Cidade cidade;
    
    @Column(name = "ende_cliente")
    @ManyToOne
    @JoinColumn(name = "clie_id")
    private Cliente cliente;
}
