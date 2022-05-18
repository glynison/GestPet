package com.gestpet.backend.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PagamentoComBoleto extends Pagamento{
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    
}
