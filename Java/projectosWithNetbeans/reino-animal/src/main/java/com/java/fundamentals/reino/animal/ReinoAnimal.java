/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.fundamentals.reino.animal;

/**
 *
 * @author HP
 */
public class ReinoAnimal {
    
    public static void main(String[] args){
        
        String cadena = "futuro";
        int [] prueba = {1,2,5,8};
       
        System.out.println("Este es el reino animal");
        
        //(short numeroDeHuesos, float peso)
        Vertebrado perro = new Vertebrado((short)102, (float)23.5);
        
        perro.setAltura(3);
        perro.setEdad((short)4); //El metodo efectivamente esta esperando un dato short
        perro.setNumeroDeHuesos((short)40);
        perro.setNumeroDeVertebras((short)60);
        perro.setTipoEsqueleto("Tipo Cartilaginoso");
        
        int num1 = 5;
        int num2 = 6;
        int resultInt = num1+num2; //11 Correcto
        
        byte num3 = 7;
        byte num4 = 3;
        //byte resutlByte = num3 + num4; //Se debe hacer casting
        byte resutlByte2 = (byte)(num3 + num4); //OOO
        int resutlByte3 = num3 + num4;
        
        perro.comer("Purina", 3.5F);
        perro.comer("Purina", (float)3.5);
        perro.desplazar(4.5f, (float)2.3, 4);
        perro.dormir(10, false);
        
        Mamifero vaca = new Mamifero();
        Mamifero vacaHija = new Mamifero();
        
        System.out.println("valor de Edad = "+vaca.getEdad());
        
        vaca.amamantarCria((float)5.2, vacaHija, 3.0f);
        vaca.succionarMama(2.5f, vacaHija, 2);
        vaca.darCalor(vacaHija, 8f);
        vaca.comer("Pasto", (float)5.8);
        System.out.println(vaca.equals(vacaHija));
        System.out.println(vaca);
        System.out.println(vacaHija);
        System.out.println("Memory Position = "+ vaca.hashCode());
        System.out.println("Memory Position = "+ vacaHija.hashCode());
        System.out.println(vaca.toString());

        System.out.println("clase a la cual pertenece la vaca = "+ vaca.getClass());
        System.out.println("name de la clase de donde viene vaca = "+vaca.getClass().getName());   
        
        Mamifero cerdoSalvaje = new Mamifero((byte)4, "Selva");
        Mamifero cerdoSalvajeHijo = new Mamifero();
        cerdoSalvaje.amamantarCria(5.3f, cerdoSalvajeHijo, (float)8.2);
    }
}
