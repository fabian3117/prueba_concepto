package com.example.backbase.dtos;

import com.example.backbase.models.CanchasModel;
import com.example.backbase.models.GeoData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.data.geo.GeoModule;

import java.io.Serializable;

/**
 * DTO for {@link CanchasModel}
 */
@Value
public class CanchasModelDto implements Serializable {
    GeoData geo_data;
    String nombre;
    String descripcion;

}