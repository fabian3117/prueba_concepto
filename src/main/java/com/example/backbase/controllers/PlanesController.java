package com.example.backbase.controllers;

import com.example.backbase.dtos.PlanDTO;
import com.example.backbase.models.PlanesModel;
import com.example.backbase.services.PlanesService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private PlanesModel GetPlaneById(@PathVariable("id") @NonNull Long id) {
        return planesService.getPlanesById(id);
    }
    @PostMapping("/created/")
    @ResponseStatus(HttpStatus.OK)
    private ResponseEntity<String> CreatePlane(@RequestBody @NonNull PlanDTO plan) {
        return ResponseEntity.ok(planesService.createNewPlan(plan));
    }
    @GetMapping("/all/")
    @ResponseStatus(HttpStatus.OK)
    private ResponseEntity<List<PlanesModel>> GetAllPlanes() {
       return ResponseEntity.ok(planesService.getAllPlanes());
    }
    //--->  Le asigno un nuevo plan al cliente
    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    private ResponseEntity UpdatePlane(@RequestBody @NonNull PlanDTO plan,@RequestAttribute("userId") @NonNull Long id) {
        planesService.updatePlan(plan,id);
        return ResponseEntity.ok().build();
    }


    //TODO ELIMINAR ESTE METODO <---
    @Deprecated
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

