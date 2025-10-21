/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.fundamentals.reino.animal;

/**
 *
 * @author HP
 */
public class Mamifero extends Vertebrado{
    private byte numeroDePatas;
    private String tipoHabitar;
    private String tipoDePiel;
    private float temperatura;
    private byte numeroDeDientes;
    
    public Mamifero(){
        super(10.8f, (short)45);
    }
    
    public Mamifero(byte numeroDePatas, String tipoHabitar){
        super(6.3f, (short)80);
        this.numeroDePatas = numeroDePatas;
        this.tipoHabitar = tipoHabitar;
    }
    
    public boolean amamantarCria(float cantidadLeche, Mamifero cria, float tiempo){
        System.out.println("La cria = "+ cria +" ha sido Amamantada con = "
                            + cantidadLeche+ "Litros de leche por = " + tiempo + "Horas");
        return true;
    }
    
    public boolean succionarMama(float cantidadLeche, Mamifero hembra, float tiempo){
        System.out.println("La cria ha succionado la mama");
        return true;
    }
    
    public float darCalor(Mamifero companiero, float tiempo){
        return (float)37.8;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "numeroDePatas=" + numeroDePatas +
                ", tipoHabitar=" + tipoHabitar + 
                ", tipoDePiel=" + tipoDePiel + 
                ", temperatura=" + temperatura + 
                ", numeroDeDientes=" + numeroDeDientes + '}';
    }

    
    
}
