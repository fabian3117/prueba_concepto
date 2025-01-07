package com.example.backbase.repository;

import com.example.backbase.models.CanchasModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//TODO ACA INCLUIR REDIS PARA REDUCIR TIEMPOS
@Repository
@Transactional
public interface CanchasRepository extends JpaRepository<CanchasModel,Long> {

}
