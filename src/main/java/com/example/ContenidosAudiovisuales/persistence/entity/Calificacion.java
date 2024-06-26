package com.example.ContenidosAudiovisuales.persistence.entity;

import java.math.BigDecimal;

import com.example.ContenidosAudiovisuales.persistence.entity.DTO.CalificacionDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "calificaciones")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCalificacion")
    private Long idCalificacion;
    
    @ManyToOne
    @JoinColumn(name = "IdContenido")
    private Contenido contenido;
    
    @ManyToOne
    @JoinColumn(name = "IdUsuario")
    private Usuario usuario;
    
    @Column(name = "Calificacion")
    private BigDecimal calificacion;
    
    @Column(name = "Comentario")
    private String comentario;

    public Long getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Long idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Calificacion(Long idCalificacion, Contenido contenido, Usuario usuario, BigDecimal calificacion,
            String comentario) {
        this.idCalificacion = idCalificacion;
        this.contenido = contenido;
        this.usuario = usuario;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public Calificacion() {
    }
    
    public CalificacionDTO toDTO(){
        CalificacionDTO dto = new CalificacionDTO();
        dto.setIdCalificacion(idCalificacion);
        dto.setContenido(contenido);
        dto.setUsuario(usuario);
        dto.setCalificacion(calificacion);
        dto.setComentario(comentario);
        return dto;
    }
}