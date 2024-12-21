package com.example.backbase.interfaces;

import com.example.backbase.enums.StatusCompra;
import lombok.NonNull;

public interface ComprasInterfaces {
    void CambiarEstadoCompra(@NonNull String id_compra,@NonNull StatusCompra nuevo_estado);

    /**
     * Para eliminar ya sea de mi buffer / cola kafka - eliminar como solicitud http para no reprocesar
     * Pensar como para mantener la idempotencia del procesamiento
     * @param id_compra
     */
    void CompraQuitarBuffer(@NonNull String id_compra);
}
