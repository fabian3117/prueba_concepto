package com.example.backbase.mappers;

import com.example.backbase.dtos.CanchasModelDto;
import com.example.backbase.models.CanchasModel;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CanchasModelMapper {
    CanchasModel toEntity(CanchasModelDto canchasModelDto);

    CanchasModelDto toDto(CanchasModel canchasModel);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CanchasModel partialUpdate(CanchasModelDto canchasModelDto, @MappingTarget CanchasModel canchasModel);
}