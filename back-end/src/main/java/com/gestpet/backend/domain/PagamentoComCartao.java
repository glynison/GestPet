package com.gestpet.backend.domain;

import lombok.Data;

@Data
public class PagamentoComCartao extends Pagamento {
    private Integer numeroParcelas;
}
