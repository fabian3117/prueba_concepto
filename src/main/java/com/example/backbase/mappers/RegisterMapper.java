package com.example.backbase.mappers;

import com.example.backbase.dtos.LoginDTO;
import com.example.backbase.models.ClienteModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegisterMapper {

    LoginDTO RegisterToLoginDTO(ClienteModel loginDTO);
}
