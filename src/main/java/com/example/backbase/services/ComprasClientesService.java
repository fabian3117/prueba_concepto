package com.example.backbase.services;

import com.example.backbase.enums.StatusCompra;
import com.example.backbase.interfaces.ComprasInterfaces;
import com.example.backbase.models.ComprasClientesModel;
import com.example.backbase.repository.ComprasClientesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
/**
 * Capa de servicio tiene que poder interactuar con ambas fuentes
 * Sea kafka o API
 */
public class ComprasClientesService implements ComprasInterfaces {

private final ComprasClientesRepository comprasClientesRepository;


    @Override
    public void CambiarEstadoCompra(@NonNull String id_compra,@NonNull StatusCompra nuevo_estado) {

        //TODO FALTO VERIFICACIONES Y EXCEPCIONES PERO LUEGO
        ComprasClientesModel compra=comprasClientesRepository.findById(id_compra).get();
        compra.setEstado_compra(nuevo_estado);
        comprasClientesRepository.save(compra);
        CompraQuitarBuffer(id_compra);
    }

    @Override
    public void CompraQuitarBuffer(@NonNull String id_compra) {

    }
}
