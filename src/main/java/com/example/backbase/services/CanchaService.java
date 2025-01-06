package com.example.backbase.services;

import com.example.backbase.dtos.CanchasModelDto;
import com.example.backbase.mappers.CanchasModelMapper;
import com.example.backbase.models.CanchasModel;
import com.example.backbase.repository.CanchasRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
//@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class CanchaService {
private final CanchasRepository canchasRepository;
@Autowired
    CanchasModelMapper canchasModelMapper;
    public List<CanchasModelDto> getAll() {

        return canchasRepository.findAll().stream().map(canchasModelMapper::toDto).toList();
    }

    public CanchasModelDto createNew(CanchasModelDto canchaModelDto) {


        return canchasModelMapper.toDto(canchasRepository.save(canchasModelMapper.toEntity(canchaModelDto)));
    }
}
