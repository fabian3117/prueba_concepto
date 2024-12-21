package com.example.backbase.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class PlanesModel {

    @Id
    private String id;  //--->  ID de cada plan <---
    private String name;

    private int price;

}
