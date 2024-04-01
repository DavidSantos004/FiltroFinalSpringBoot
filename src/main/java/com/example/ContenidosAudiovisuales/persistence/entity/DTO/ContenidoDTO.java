package com.example.ContenidosAudiovisuales.persistence.entity.DTO;

public class ContenidoDTO {
    private Long idContenido;
    private String nombre;
    private String tipoDeContenido;
    private String genero1;
    private String genero2;
    
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

}
