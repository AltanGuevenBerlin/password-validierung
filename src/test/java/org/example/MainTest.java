package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void checkLetters_expectTrue_whenLetters() {
        //Given
        String password = "Altan";
        //WHEN
        boolean checkLetters = Main.checkingIfString( password );
        //THEN
        Assertions.assertTrue(checkLetters);
    }
    @Test
    void  checkDigits_expectTrue_whenDigits() {
        //GIVEN
    String password = "152368";
        // WHEN
        boolean checkDigits = Main.checkingIfDigits( password );
        // THEN
        Assertions.assertTrue(checkDigits);
    }
  @Test
    void checkLength_expectTrue_whenLength() {
        // Given
         String password ="Altan12?";
        // WHEN
        boolean checkLength = Main.checkingIfLength( password );
        // THEN
         Assertions.assertTrue(checkLength);

    }
    @Test
    void checkSpecialCharackters() {
        // GIVEN
        String password = "Altan1?!";
        // WHEN
        boolean checkSpecial = Main.checkingIfSpecial ( password);
        // THEN
        Assertions.assertTrue(checkSpecial);
    }

    void yieldOK_when_FirstLine_Is_Digit_Letter_SpecialCharacter() {

    }
}
