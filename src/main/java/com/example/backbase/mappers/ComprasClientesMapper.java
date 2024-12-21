package com.example.backbase.mappers;

import com.example.backbase.dtos.ComprasClienteDTO;
import com.example.backbase.models.ComprasClientesModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComprasClientesMapper {

    ComprasClienteDTO ComprasClienteModelToDTO(ComprasClientesModel comprasClientesModel);
}
