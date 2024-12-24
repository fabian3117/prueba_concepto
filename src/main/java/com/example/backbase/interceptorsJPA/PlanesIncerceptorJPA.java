package com.example.backbase.interceptorsJPA;

import com.example.backbase.models.PlanesModel;
import jakarta.persistence.PrePersist;

public class PlanesIncerceptorJPA {
    @PrePersist
    public void prePersist(PlanesModel planesModel){

    }

}
