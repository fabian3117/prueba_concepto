package com.example.backbase.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {

    @Deprecated
    private Long id;

    private String username;
    //--->  Clave hasheadas <---

    private String password;
    private String email;
    private String token;
}
