package com.example.backbase.enums;

import lombok.Getter;

@Getter
public enum StatusCompra {
    PAGADO("PAGADO"),
    PENDIENTE("PENDIENTE");
    private String estatus;
    StatusCompra(String estatus) {
        this.estatus = estatus;
    }

}
