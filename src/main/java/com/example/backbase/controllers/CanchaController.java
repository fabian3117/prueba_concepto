package com.example.backbase.controllers;

import com.example.backbase.dtos.CanchasModelDto;
import com.example.backbase.services.CanchaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/canchas")
@RequiredArgsConstructor
public class CanchaController {
    private final CanchaService canchaService;
    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<CanchasModelDto> getAll(){
        return canchaService.getAll();
    }
    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)

    public CanchasModelDto create(@RequestBody CanchasModelDto canchaModelDto){
        return canchaService.createNew(canchaModelDto);
    }
}
