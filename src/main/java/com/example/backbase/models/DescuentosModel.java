package com.example.backbase.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DescuentosModel {
    @Id
    private String id;

    private String nombre;
    private String descripcion;

    private double porcentaje;      //--->   Porcentaje de descuento <---
}
