package com.example.backbase.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link ReservasModel}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservasModelDto implements Serializable {
    private Date fecha;
    private String nombre;
    private String descripcion;
    private String estado;
}