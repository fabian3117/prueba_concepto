package com.example.backbase.models;

import com.example.backbase.interceptorsJPA.ClienteInterceptorJPA;
import com.example.backbase.interceptorsJPA.PlanesIncerceptorJPA;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@EntityListeners(PlanesIncerceptorJPA.class)

public class PlanesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //--->  ID de cada plan <---
    private String name;

    //--->
    private Long user;
    private int price;

}
