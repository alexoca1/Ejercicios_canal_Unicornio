package org.example;

/*
*cantidad de ocurrencias de un caracter
*
* */

import com.sun.security.jgss.GSSUtil;

public class ejercicio22 {
    public static int repetido(String t, char caracter){
        char[] c=t.toCharArray();
        int i=0;
        for(char a : c){
            char temp=a;
            if(caracter == temp){
                i++;

            }

        }



        return i;
    }
    public static void main(String[] args) {

        String texto="Caravana";
        char caracter='a';
        int cant;
        cant = repetido(texto,caracter);
        System.out.println("la cantidad de veces que se repite "+caracter+" es "+cant);

    }
}
