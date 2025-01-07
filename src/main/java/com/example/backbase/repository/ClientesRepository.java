package com.example.backbase.repository;

import com.example.backbase.models.ClienteModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ClientesRepository extends JpaRepository<ClienteModel,Long> {
    List<ClienteModel> findByEmailContainsIgnoreCase(String email);

    boolean existsByEmail(String email);

    List<ClienteModel> findByEmail(String email);
    long countAllByEmail(String email);
    //--->  Al guardar deberia generar un token para enviar <---
}
