package org.utils;

import org.crosscutting.constants.SecurityLevel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilsTest {

    PasswordUtils passwordUtils;

    @BeforeEach
    void setup(){
        passwordUtils = new PasswordUtils();
    }

    @Test
    void testPasswordWhenIsWeak(){
        String password = "abx8EF*7";
        assertEquals(SecurityLevel.WEAK, passwordUtils.validPassword(password),
                "tamaño del password = "+password.length()+" Debe ser menor a 8");
    }

    @Test
    void testPasswordWhenIsMedium(){
        String password = "abxc8EF*7";
        assertEquals(SecurityLevel.MEDIUM, passwordUtils.validPassword(password),
                "tamaño del password = "+password.length()+" Debe ser menor a 10");
    }

    @Test
    void testPasswordWhenIsHigh(){
        String password = "abxc8EF18*5o7";
        assertEquals(SecurityLevel.HIGH, passwordUtils.validPassword(password),
                "tamaño del password = "+password.length()+" Debe ser mayor que 12 y menor a 14");
    }

    @Test
    void testPasswordOverMaxLength(){
        String password = "abxc8EF18*5o7xx";
        assertEquals(SecurityLevel.FAILED, passwordUtils.validPassword(password),
                "tamaño del password = "+password.length()+" Debe ser menor que 14");
        }
}