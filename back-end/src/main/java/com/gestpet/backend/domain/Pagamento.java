package com.gestpet.backend.domain;

import lombok.Data;

@Data
public class Pagamento {
    private Integer id;
    private EstadoPagamento estadoPagamento;
    private Pedido pedido;
}
