package com.example.backbase.interfaces;

import com.example.backbase.enums.StatusCompra;
import lombok.NonNull;

public interface ComprasInterfaces{
    public void CambiarEstadoCompra(@NonNull String id_compra,@NonNull StatusCompra nuevo_estado);

    public void CompraQuitarBuffer(@NonNull String id_compra);
}
