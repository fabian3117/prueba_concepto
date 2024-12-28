package com.example.backbase.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AlertasDTO  implements Serializable {
    private Long id;
    private String titulo;
    private String texto;
}
