package com.example.backbase.repository;

import com.example.backbase.models.ComprasClientesModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ComprasClientesRepository extends JpaRepository<ComprasClientesModel, String> {
}
