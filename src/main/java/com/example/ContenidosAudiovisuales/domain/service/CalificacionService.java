package com.example.ContenidosAudiovisuales.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContenidosAudiovisuales.domain.repository.CalificacionRepository;

@Service
public class CalificacionService {

    private final CalificacionRepository calificacionRepository;

    @Autowired
    public CalificacionService(CalificacionRepository calificacionRepository){
        this.calificacionRepository = calificacionRepository;
    }

}
