package org.example;

import java.time.LocalDate;
import org.contenido.Pelicula;
import org.utils.ScannerUtils;
import org.plataforma.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Usuario usuario = new Usuario();
        usuario.nombre = ScannerUtils.capturarTexto("ingrese su nombre");

        Pelicula pelicula = new Pelicula();

        pelicula.titulo = ScannerUtils.capturarTexto("Ingrese el valor de titulo");
        pelicula.calificacion = ScannerUtils.caputarDecimal("Ingrese el valor de la calificacion");
        pelicula.descripcion = ScannerUtils.capturarTexto("Ingrese el valor de la descripcion");
        pelicula.genero = ScannerUtils.capturarTexto("Ingrese el valor del genero");
        pelicula.disponible = true;
        pelicula.anioEstreno = LocalDate.of(2025, 10, 05);

        System.out.println("informacion de la pelicula \n" + pelicula.obtenerFichaTecnica());

        usuario.ver(pelicula);
    }
}