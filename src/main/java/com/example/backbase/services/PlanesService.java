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
    public PlanesModel getPlanesById(Long id) {
        return planesRepository.findById(id).orElse(new PlanesModel());
    }

    public PlanDTO getPlanOfUser(@NonNull Long userId) {

        String plan=clienteService.getClienteById(userId).getPlan_asociado();
        return planesRepository.findById(Long.valueOf(plan)).stream().map(planesMapper::PlanModelToPlanDTO).findFirst().orElse(new PlanDTO());
    }

    public String createNewPlan(@NonNull PlanDTO plan) {
        if(planesRepository.existsByName(plan.getName())){
            throw new RuntimeException("Plan already exists");
        }
        PlanesModel entity = planesMapper.PlanDTOToPlanModel(plan);
        entity.setUser(10L);
        return  String.valueOf(planesRepository.save(entity).getId());
    }

    //TODO implementar notificacion via kafka para notificar a los otros micros <---
    public void updatePlan(@NonNull PlanDTO plan, @NonNull Long id) {

        List<PlanesModel> byName = planesRepository.findByName(plan.getName());
        if(byName.size()!=1){
            throw new RuntimeException("Plan fail");
        }

//        PlanesModel entity = planesRepository.findByName((plan.getName()));

        clienteService.updateClient(id,byName.get(0).getId());
    }
}
