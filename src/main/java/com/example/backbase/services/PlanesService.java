package com.example.backbase.services;

import com.example.backbase.dtos.PlanDTO;
import com.example.backbase.mappers.PlanesMapper;
import com.example.backbase.models.PlanesModel;
import com.example.backbase.repository.PlanesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlanesService {
    private final ClienteService clienteService;

    private final PlanesRepository planesRepository;

    @Autowired
    private PlanesMapper planesMapper;

    public List<PlanesModel> getAllPlanes() {
        return planesRepository.findAll();
    }
    public PlanesModel getPlanesById(String id) {
        return planesRepository.findById(id).orElse(new PlanesModel());
    }

    public PlanDTO getPlanOfUser(@NonNull Long userId) {

        String plan=clienteService.getClienteById(userId).getPlan_asociado();
        return planesRepository.findById(plan).stream().map(planesMapper::PlanModelToPlanDTO).findFirst().orElse(new PlanDTO());
    }
}
