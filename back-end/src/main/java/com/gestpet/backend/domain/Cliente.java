package com.gestpet.backend.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clie_id")
    private Integer id;

    @Column(name = "clie_nome")
    private String nome;
    
    @Column(name = "clie_email")
    private String email;
    
    @Column(name = "clie_cpfCnpj")
    private String cpfCnpj;
    
    @Column(name = "clie_tipo")
    private String tipo; // no diagrama está: -tipo : TipoCliente (??)
    
    @Column(name = "clie_endereco")
    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos;
    
    @Column(name = "clie_telefone")
    private List<Telefone> telefones;
    
    @Column(name = "clie_pedido")
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;
}
