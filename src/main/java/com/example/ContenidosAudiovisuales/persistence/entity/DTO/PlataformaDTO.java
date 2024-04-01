package com.example.ContenidosAudiovisuales.persistence.entity.DTO;

public class PlataformaDTO {

    private Long idPlataforma;

    private String tipoDeContenido;

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
