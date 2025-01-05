package com.example.backbase.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class BodyMail implements Serializable  {
    private String destino;
    private String texto;
    private String asunto;
    private String tipo;
}
