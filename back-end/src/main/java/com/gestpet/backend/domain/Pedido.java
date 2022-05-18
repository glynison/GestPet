package com.gestpet.backend.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Pedido {
    private Integer id;
    private LocalDate instante;
    private List<Produto> itens;
    private Cliente cliente;
    private Pagamento pagamento;
    private Endereco enderecoEntrega;
}
