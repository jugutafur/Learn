package com.borrar.Uno.App.Model;

import java.util.Date;

public class Post {
    private int id;
    private String descripcion;
    private String urlImagen;
    private String titulo;
    private Date fecha;

    public Post(int id, String descripcion, String urlImagen, String titulo, Date fecha){
        this.id = id;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public Post(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
