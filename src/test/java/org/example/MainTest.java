package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void Letters() {
        //Given
        String password = "Altan";
        //WHEN
        boolean checkLetters = Main.checkingIfString( password );
        //THEN
        Assertions.assertTrue(checkLetters);
    }
    @Test
    void  Digits() {
        //GIVEN
    String password = "152368";
        // WHEN
        boolean checkDigits = Main.checkingIfDigits( password );
        // THEN
        Assertions.assertTrue(checkDigits);
    }
    void checkUpperCase() {

    }
    void length() {

    }
    void checkSpecialCharackters() {

    }

    void yieldOK_when_FirstLine_Is_Digit_Letter_SpecialCharacter() {

    }
}
