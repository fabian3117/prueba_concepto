package com.example.backbase.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class ClienteModel {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private Date fecha_alta;
    private Date fecha_creacion;
}
