package org.example;

public class ejercicio21 {
    public static void main(String[] args) {


        String texto = "HOla como estas á";
        int cont = 0;
        texto = texto.toLowerCase();
        char[] t = texto.toCharArray();
        System.out.println(texto);
        for (char c : t) {


            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                cont++;

            }
        }

        System.out.println("la cantidad de vocales es " + cont);
    }
}