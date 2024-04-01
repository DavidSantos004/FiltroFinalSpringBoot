package com.example.ContenidosAudiovisuales.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.ContenidosAudiovisuales.persistence.entity.Contenido;

@Service
public interface ContenidoRepository extends JpaRepository<Contenido, Long>{

    
}
