package com.gestpet.backend.domain;

import lombok.Data;

@Data
public class Endereco {
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cidade cidade;
    private Cliente cliente;
}
