package com.example.backbase.controllers;

import com.example.backbase.dtos.PlanDTO;
import com.example.backbase.models.PlanesModel;
import com.example.backbase.services.PlanesService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
@RequiredArgsConstructor
public class PlanesController {

    private final PlanesService planesService;

    /**
     * Obtencion de plan asociado a cliente
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private PlanesModel GetPlaneById(@PathVariable("id") @NonNull String id) {
        return planesService.getPlanesById(id);
    }
    @PostMapping("/created")
    @ResponseStatus(HttpStatus.OK)
    private void CreatePlane(@RequestBody @NonNull PlanDTO plan) {
        planesService.createNewPlan(plan);
    }


    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    private PlanDTO GetPlanUser(@RequestAttribute("userId")Long userId) {

        return planesService.getPlanOfUser(userId);
    }
//--->  Ahora el cliente quiere comprar un plan <---
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)

    public void BuyPlane(@PathVariable("id") @NonNull String id, @RequestBody PlanDTO plan) {

    }
}

