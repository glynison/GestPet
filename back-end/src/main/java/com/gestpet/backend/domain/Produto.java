package com.gestpet.backend.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Integer id;
    
    @NotNull 
    @Column(name = "prod_nome")
    private String nome;
    
    @NotNull 
    @Column(name = "prod_preco")
    private Double preco;
    
    @ManyToOne
    @JoinColumn(name = "cate_id")
    @JsonIgnore
    private Categoria categorias;
    
    @OneToOne
    private ItemPedido itemPedido;

   

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

    
    
    
    
}
