package org.utils;

import org.crosscutting.constants.SecurityLevel;

public class PasswordUtils {

    //contraseña debe tener al menos una letra mayuscula, una minuscula, un numero y un caracter especial
    //y debe tener entre 8 y 14 caracteres
    //si la contraseña tiene menos de 9 caracteres es debil
    //si tiene entre 9 y 12 es mediana
    //si tiene mas de 12 es fuerte

    public SecurityLevel assertPassword(String password){
        if(password.length() < 9){
            return SecurityLevel.WEAK;
        } else if(password.length() < 12){
            return SecurityLevel.MEDIUM;
        } else {
            return SecurityLevel.HIGH;
        }
    }

    public SecurityLevel validPassword(String password){
        if(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,14}$")){
            return assertPassword(password);
        }else {
            return SecurityLevel.FAILED;
        }
    }
}
