package com.example.ContenidosAudiovisuales.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContenidosAudiovisuales.domain.repository.CalificacionRepository;
import com.example.ContenidosAudiovisuales.persistence.entity.Calificacion;
import com.example.ContenidosAudiovisuales.persistence.entity.DTO.CalificacionDTO;

@Service
public class CalificacionService {

    private final CalificacionRepository calificacionRepository;

    @Autowired
    public CalificacionService(CalificacionRepository calificacionRepository){
        this.calificacionRepository = calificacionRepository;
    }

    public List<CalificacionDTO> getAllCalificaciones(){
        return calificacionRepository.findAll().stream()
                .map(Calificacion::toDTO)
                .toList();
    }
    
}
