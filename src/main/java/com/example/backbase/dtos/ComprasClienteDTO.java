package com.example.backbase.dtos;

import com.example.backbase.enums.StatusCompra;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ComprasClienteDTO {
    private String id;
    private Date fecha_compra;
    private String id_cliente_compro;
    @Enumerated(EnumType.STRING)
    private StatusCompra estado_compra;
}
