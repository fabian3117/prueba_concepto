package com.example.backbase.dtos;

import com.example.backbase.models.ReservasModel;
import com.example.backbase.models.ReservasModelDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String nombre;
    private String apellido;
    private Date fecha_alta;
    private Date fecha_creacion;
    private String plan_asociado;
    private Long userId;
    private String password;

    private List<ReservasModelDto> reservas;

}
