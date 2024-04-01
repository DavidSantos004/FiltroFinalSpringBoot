package com.example.ContenidosAudiovisuales.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.ContenidosAudiovisuales.persistence.entity.Plataforma;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, Long> {

}
