package com.example.backbase.controllers;

import com.example.backbase.dtos.LoginDTO;
import com.example.backbase.dtos.RegisterDTO;
import com.example.backbase.services.AuthService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
@CrossOrigin("*")
public class LoginController {
    @Autowired
    private AuthService authService;
    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<LoginDTO> login(@RequestBody @NonNull LoginDTO loginDTO){

        //--->  Verifico usuario y en caso correcto generacion de token <---

        loginDTO.setToken(authService.autheUser(loginDTO));

        return ResponseEntity.status(HttpStatus.OK).body(loginDTO);
    }
    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> registrar(@RequestBody @NonNull RegisterDTO registro){
        return authService.createUser(registro);
    }
}
