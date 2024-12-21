package com.example.backbase.repository;

import com.example.backbase.models.PlanesModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PlanesRepository extends JpaRepository<PlanesModel,String> {
}
