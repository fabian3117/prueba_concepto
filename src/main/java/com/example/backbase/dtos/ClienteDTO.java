package com.example.backbase.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String nombre;
    private String apellido;
    private Date fecha_alta;
    private Date fecha_creacion;

}
