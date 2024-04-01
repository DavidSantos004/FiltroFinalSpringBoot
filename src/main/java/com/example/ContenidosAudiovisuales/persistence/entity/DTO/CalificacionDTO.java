package com.example.ContenidosAudiovisuales.persistence.entity.DTO;

import java.math.BigDecimal;

import com.example.ContenidosAudiovisuales.persistence.entity.Contenido;
import com.example.ContenidosAudiovisuales.persistence.entity.Usuario;

public class CalificacionDTO {

    private Long idCalificacion;
    private Contenido contenido;
    private Usuario usuario;
    private BigDecimal calificacion;
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

}
