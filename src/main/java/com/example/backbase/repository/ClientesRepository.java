package com.example.backbase.repository;

import com.example.backbase.models.ClienteModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ClientesRepository extends JpaRepository<ClienteModel,Long> {
}
