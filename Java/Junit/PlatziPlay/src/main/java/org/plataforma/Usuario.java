package org.plataforma;

import org.contenido.Pelicula;

public class Usuario {
    public String nombre;
    public String email;

    public void ver(Pelicula pelicula){
        System.out.println(nombre + " esta viendo ...");
        pelicula.reproducir();
    }
}
