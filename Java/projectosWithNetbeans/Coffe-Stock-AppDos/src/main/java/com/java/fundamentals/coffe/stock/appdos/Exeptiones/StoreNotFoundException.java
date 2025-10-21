package com.java.fundamentals.coffe.stock.appdos.Exeptiones;

//Al extends de la clase Exception ya esta clase se vuelve una exception gestionada
//Esta sera lanzada en el caso de NO ENCONTRAR UNA TIENDA
public class StoreNotFoundException extends Exception{

    //se puede llamar mas constructores que vienen en la super clase 
    public StoreNotFoundException(String message) {
        super(message);
    }

    public StoreNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
