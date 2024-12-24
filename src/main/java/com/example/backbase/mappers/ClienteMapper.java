package com.example.backbase.mappers;


import com.example.backbase.dtos.ClienteDTO;
import com.example.backbase.dtos.LoginDTO;
import com.example.backbase.dtos.RegisterDTO;
import com.example.backbase.models.ClienteModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteDTO ClienteEntityToDTO(ClienteModel clienteModel);
    ClienteModel DTOToClienteModel(ClienteDTO clienteDTO);
//    @Mapping(target = "nombre")
    ClienteModel RegisterDTOToClienteModel(RegisterDTO registro);
}
