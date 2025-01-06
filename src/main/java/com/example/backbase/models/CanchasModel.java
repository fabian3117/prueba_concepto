package com.example.backbase.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.GeoModule;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class CanchasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    GeoData geo_data;
    String nombre;
    String descripcion;
}
