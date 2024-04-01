package com.example.ContenidosAudiovisuales.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataforma")
public class Plataforma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPlataforma")
    private Long idPlataforma;
    
    @Column(name = "TipoDeContenido")
    private String tipoDeContenido;
    
    @Column(name = "PlataformaContenido")
    private String plataformaContenido;

    public Long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Long idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getTipoDeContenido() {
        return tipoDeContenido;
    }

    public void setTipoDeContenido(String tipoDeContenido) {
        this.tipoDeContenido = tipoDeContenido;
    }

    public String getPlataformaContenido() {
        return plataformaContenido;
    }

    public void setPlataformaContenido(String plataformaContenido) {
        this.plataformaContenido = plataformaContenido;
    }
    
    
    
}