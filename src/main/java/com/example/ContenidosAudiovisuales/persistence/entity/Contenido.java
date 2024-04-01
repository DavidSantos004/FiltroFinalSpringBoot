package com.example.ContenidosAudiovisuales.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contenido")
public class Contenido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdContenido")
    private Long idContenido;
    
    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "TipoDeContenido")
    private String tipoDeContenido;
    
    @Column(name = "Genero1")
    private String genero1;
    
    @Column(name = "Genero2")
    private String genero2;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "EstadoDeVisualizacion")
    private EstadoDeVisualizacion estadoDeVisualizacion;

    public Long getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(Long idContenido) {
        this.idContenido = idContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeContenido() {
        return tipoDeContenido;
    }

    public void setTipoDeContenido(String tipoDeContenido) {
        this.tipoDeContenido = tipoDeContenido;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public EstadoDeVisualizacion getEstadoDeVisualizacion() {
        return estadoDeVisualizacion;
    }

    public void setEstadoDeVisualizacion(EstadoDeVisualizacion estadoDeVisualizacion) {
        this.estadoDeVisualizacion = estadoDeVisualizacion;
    }

    public Contenido(Long idContenido, String nombre, String tipoDeContenido, String genero1, String genero2,
            EstadoDeVisualizacion estadoDeVisualizacion) {
        this.idContenido = idContenido;
        this.nombre = nombre;
        this.tipoDeContenido = tipoDeContenido;
        this.genero1 = genero1;
        this.genero2 = genero2;
        this.estadoDeVisualizacion = estadoDeVisualizacion;
    }

    public Contenido() {
    }
    
    
}