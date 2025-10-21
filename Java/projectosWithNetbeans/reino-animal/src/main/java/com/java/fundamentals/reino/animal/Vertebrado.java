/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.fundamentals.reino.animal;

/**
 *
 * @author HP
 */
public class Vertebrado extends Object{
    private short numeroDeHuesos;
    private float peso;
    private float altura;
    private String tipoEsqueleto;
    private short numeroDeVertebras;
    private short edad = 8;
    private byte prueba;
    
    //constructor
    public Vertebrado(short numeroDeHuesos, float peso){
        this.numeroDeHuesos = numeroDeHuesos;
        this.peso = peso;
    }
    
    public Vertebrado(float altura, short numeroDeVertebras){
        this.altura = altura;
        this.numeroDeVertebras = numeroDeVertebras;
    }
    
    
    
    //Comportamental
    public boolean comer(String tipoDeAlimento, float cantidad){
        System.out.println("El vertebrado ha comido");
        return true;
    }
    
    public boolean desplazar(float velocidad, float puntoInicial, float distancia){
        System.out.println("El vertebrado se ha desplazado");
        return true;
    }
    
    public String habitar(String tipoDeHabitad){
        return "El vertebrado es Terrestre";
    }
    
    public float dormir (float duracion, boolean isNocturno){
        System.out.println("Vertebrado a dormir");
        return 8;
    }
    
    //Getter y Setter

    public short getNumeroDeHuesos() {
        return this.numeroDeHuesos;
    }

    public void setNumeroDeHuesos(short numeroDeHuesos) {
        this.numeroDeHuesos = numeroDeHuesos;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTipoEsqueleto() {
        return this.tipoEsqueleto;
    }

    public void setTipoEsqueleto(String tipoEsqueleto) {
        this.tipoEsqueleto = tipoEsqueleto;
    }

    public short getNumeroDeVertebras() {
        return this.numeroDeVertebras;
    }

    public void setNumeroDeVertebras(short numeroDeVertebras) {
        this.numeroDeVertebras = numeroDeVertebras;
    }

    public short getEdad() {
        return this.edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
    
}
