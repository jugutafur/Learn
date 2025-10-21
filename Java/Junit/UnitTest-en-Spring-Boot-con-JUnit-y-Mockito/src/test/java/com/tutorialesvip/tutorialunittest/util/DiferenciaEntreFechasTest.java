package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        String fechaIndependencia = "27/02/1844";

        //Este test siempre va a fallar esto es debido que la siguiente linea va a comparar el dia en el que se
        //ejecuto obteniendo fecha today y la compara con las lineas de assertions
        //Para saber los numero haga debug y revise el valor de resultado
        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia);

        Assertions.assertEquals(12,resultado.getDays() );
        Assertions.assertEquals(7,resultado.getMonths() );
        Assertions.assertEquals(181,resultado.getYears() );
    }
}