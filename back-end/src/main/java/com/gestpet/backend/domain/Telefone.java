package com.gestpet.backend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
//@Entity
public class Telefone {

    //@Column(name = "tele_numero")
    private String numero;

}
