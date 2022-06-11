package com.gestpet.backend.DTO;

public class ProdutoPostDTO {
	private String nome;
	private Double preco;
	private Integer idCategorias;
	private String descricao;
	
	public ProdutoPostDTO(String nome, Double preco, Integer idCategorias, String descricao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.idCategorias = idCategorias;
		this.descricao = descricao;
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

	public Integer getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Integer idCategorias) {
		this.idCategorias = idCategorias;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
