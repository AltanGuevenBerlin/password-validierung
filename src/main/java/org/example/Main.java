package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println(checkingIfString("Altan"));

    }

    public static boolean checkingIfString(String password) {
        if (password.matches("[a-zA-Z]+")) {
            System.out.println("Password is correct");
            return true;
        } else {
            System.out.println("Password doesn't contain upper and lower letters");
            return false;
        }
    }

    public static boolean checkingIfDigits(String password) {
        if (password.matches("[0-9]+")) {
            System.out.println("Password is correct");
            return true;
        } else {
            System.out.println("Password doesn't contain digits");
            return false;
        }
    }

    public static boolean checkingIfLength(String password) {
        return password.length ()  >= 8;
    }


    public static boolean checkingIfSpecial(String password) {
        if (password.contains( "")) {
            return true;
    } else {
            System.out.println(" Password doesn't contain special characters");
            return false;
        }
}

    // prüfe ob String ist
    // min. Länge von 8 Zeichen
    // muss Ziffern enthalten
    // Groß- und Kleinschreibung
    // Überprüfung von "unsicheren" PW Aa345678
    // muss Sonderzeichen enthalten
    // BONUS-BONUS: Generiere selbständig ein PW



}