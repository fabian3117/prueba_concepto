package com.example.backbase.controllers;

import com.example.backbase.models.PlanesModel;
import com.example.backbase.services.PlanesService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PlanesController {

    private final PlanesService planesService;
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)

    private PlanesModel GetPlaneById(@PathVariable("id") @NonNull String id) {
        return planesService.getPlanesById(id);
    }
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    private List<PlanesModel> GetPlanes(){
        return planesService.getAllPlanes();
    }

}
