package com.example.backbase.interceptorsJPA;

import com.example.backbase.models.ClienteModel;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.PrePersist;

import java.lang.annotation.Annotation;
import java.util.Date;


public class ClienteInterceptorJPA {

    @PrePersist
    public void prePersist(ClienteModel clienteModel){
        clienteModel.setFecha_alta(new Date());
        clienteModel.setFecha_creacion(new Date());
        clienteModel.setPlan_asociado("");

    }
}
