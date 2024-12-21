package com.example.backbase.services;

import com.example.backbase.models.PlanesModel;
import com.example.backbase.repository.PlanesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlanesService {
    private final PlanesRepository planesRepository;

    public List<PlanesModel> getAllPlanes() {
        return planesRepository.findAll();
    }
    public PlanesModel getPlanesById(String id) {
        return planesRepository.findById(id).orElse(new PlanesModel());
    }
}
