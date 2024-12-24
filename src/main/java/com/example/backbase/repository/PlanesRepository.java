package com.example.backbase.repository;

import com.example.backbase.models.PlanesModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface PlanesRepository extends JpaRepository<PlanesModel,Long> {
    boolean existsByName(String name);

    List<PlanesModel> findByName(String name);

//    < findByName(String name);
}
