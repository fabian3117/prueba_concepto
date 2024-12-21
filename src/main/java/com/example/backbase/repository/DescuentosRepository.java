package com.example.backbase.repository;

import com.example.backbase.models.DescuentosModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DescuentosRepository extends JpaRepository<DescuentosModel,String> {
}
