package org.example;
/*
* una cadena dendtro de un texto cuantas veces se repite
* */

public class ejercicio27 {
    public static int contador(String t, String c){
        char[] text=t.toCharArray();
        char[] cad=c.toCharArray();
        int cant=0;
        int cont=0;
        System.out.println(cad.length);
        for(int i=0;i<text.length-cad.length;i=i+cad.length-1){

            for(int j=0;j<cad.length-1;j++){
                if(text[j+i]==cad[j]){

                    cant++;
                    if(cant==cad.length){
                        cont++;
                        cant=0;
                    }

                }
            }

        }


        return cont;
    }
    public static void main(String[] args) {
        String texto="Hola como estas, voy contar estas varias veces hasta generar malestar estas estas";
        String cadena="estas";
        int cantidad;
        cantidad=contador(texto, cadena);
        System.out.println("la cadena: "+cadena+" se repite "+cantidad+" de veces");
    }
}
