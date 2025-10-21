package org.contenido;

import java.time.LocalDate;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public LocalDate anioEstreno;
    public double calificacion;
    public boolean disponible;

    public Pelicula(){
        this.titulo = "matrix recargado";
        this.descripcion = "Pelicula de accion";
        this.duracion = 120;
        this.genero = "science fiction";
        this.anioEstreno = LocalDate.of(2025, 9, 05);
        this.calificacion = 2.5;
        this.disponible= false;
    }

    public Pelicula(String titulo, String descripcion, int duracion, String genero, LocalDate
                            anioEstreno, double calificacion, boolean disponible){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.genero = genero;
        this.anioEstreno = anioEstreno;
        this.calificacion = calificacion;
        this.disponible= disponible;
    }


    public void reproducir(){
        System.out.println("Reproduciendo "+ titulo);
    }

    public String obtenerFichaTecnica(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("titulo =").append(titulo).append("\n")
                .append("descripcion =").append(descripcion).append("\n")
                .append("duracion =").append(duracion).append("\n")
                .append("genero =").append(genero).append("\n")
                .append("anioEstreno =").append(anioEstreno).append("\n")
                .append("calificacion =").append(calificacion).append("\n")
                .append("disponible =").append(disponible);
        return stringBuilder.toString();
    }

    public void calificar(double calificacion){
        if(calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        };
    }

    public boolean esPopular(){
        return calificacion >=4;
    }
}
