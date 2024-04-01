package com.example.ContenidosAudiovisuales.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContenidosAudiovisuales.domain.repository.ContenidoRepository;

@Service
public class ContenidoServicio {

    private final ContenidoRepository contenidoRepository;

    @Autowired
    public ContenidoServicio(ContenidoRepository contenidoRepository){
        this.contenidoRepository = contenidoRepository;
    }
}
