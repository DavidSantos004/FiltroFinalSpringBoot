package com.example.ContenidosAudiovisuales.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContenidosAudiovisuales.domain.repository.CalificacionRepository;
import com.example.ContenidosAudiovisuales.domain.repository.PlataformaRepository;

@Service
public class PlataformaService {

    private final PlataformaRepository plataformaRepository;

    @Autowired
    public PlataformaService(PlataformaRepository plataformaRepository){
        this.plataformaRepository = plataformaRepository;
    }
}
