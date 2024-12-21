package com.example.backbase.models;

import com.example.backbase.enums.StatusCompra;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
/**
 * Este es el vinculo entre lo que compro el cliente
 */
public class ComprasClientesModel {
    @Id
    private String id;
    private Date fecha_compra;
    private String id_cliente_compro;
    @Enumerated(EnumType.STRING)
    private StatusCompra estado_compra;
}
