package org.contenido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PeliculaTest {

    Pelicula pelicula;

    @BeforeEach
    public void setUp() {
        pelicula= new Pelicula("matrix recargado", "Pelicula de accion", 120,
                "science fiction", java.time.LocalDate.of(2025, 9, 05), 2.5, false);
    }

    @Test
    void reproducir_mensajeCorrecto() {

        Pelicula pelicula = new Pelicula();
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pelicula.reproducir();

        assertEquals("Reproduciendo matrix recargado", outContent.toString().replace("\r\n", ""));
        System.setOut(System.out); // Restaurar salida estándar

        assertEquals("Reproduciendo matrix recargado", "Reproduciendo "+pelicula.titulo, "El valor actual es diferente al esperado");
    }

    @Test
    void obtenerFichaTecnica() {
        StringBuilder stringBuilderOutput = new StringBuilder();
        stringBuilderOutput.append("titulo =").append(pelicula.titulo).append("\n")
                .append("descripcion =").append(pelicula.descripcion).append("\n")
                .append("duracion =").append(pelicula.duracion).append("\n")
                .append("genero =").append(pelicula.genero).append("\n")
                .append("anioEstreno =").append(pelicula.anioEstreno).append("\n")
                .append("calificacion =").append(pelicula.calificacion).append("\n")
                .append("disponible =").append(pelicula.disponible);
        String stringActual = "titulo =matrix recargado\n" +
                "descripcion =Pelicula de accion\n" +
                "duracion =120\n" +
                "genero =science fiction\n" +
                "anioEstreno =2025-09-05\n" +
                "calificacion =2.5\n" +
                "disponible =false";
        assertEquals(stringBuilderOutput.toString(),stringActual,"El valor actual es diferente al esperado");
    }

    @Test
    void calificar() {
        double calificacion = pelicula.calificacion;
        boolean isInsideRange = calificacion >= 0 && calificacion <= 5;
        assertTrue(isInsideRange, "La calificación NO está dentro del rango permitido (0-5)");
    }

    @Test
    void esPopular() {
    }
}