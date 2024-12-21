package com.example.backbase.mappers;


import com.example.backbase.dtos.ClienteDTO;
import com.example.backbase.models.ClienteModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteDTO ClienteEntityToDTO(ClienteModel clienteModel);
    ClienteModel DTOToClienteModel(ClienteDTO clienteDTO);
}
