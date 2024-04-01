package com.example.ContenidosAudiovisuales.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ContenidosAudiovisuales.persistence.entity.Calificacion;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Long>{

    

}
