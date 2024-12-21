package com.example.backbase.mappers;

import com.example.backbase.dtos.PlanDTO;
import com.example.backbase.models.PlanesModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlanesMapper {
    PlanDTO PlanModelToPlanDTO(PlanesModel plan);

}
