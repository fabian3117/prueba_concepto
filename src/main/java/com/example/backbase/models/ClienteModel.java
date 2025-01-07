package com.example.backbase.models;

import com.example.backbase.interceptorsJPA.ClienteInterceptorJPA;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@EntityListeners(ClienteInterceptorJPA.class)
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Date fecha_alta;
    private Date fecha_creacion;
    private String plan_asociado;
    private String email;
    //--->  userId del cliente  <---
    private Long userId;
    private String password;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    List<ReservasModel> reservas;
}
