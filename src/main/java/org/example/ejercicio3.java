package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {
       /* int numero = 39902292;
        int numero2 = numero;
        int numeroMayor=0, numeroMenor=9;
        int i=0;
        while (numero2 > 0) {

           i++;
            numero2 = numero2 / 10;


        }
        int k=10;
        int numero3=numero;
        int numero4=numero;
        for(int j=(i-1);j>0;j--){

            k= (int) Math.pow(10,j);

            numero3=numero4/k;
            numero4=numero4-numero3*k;



            if(numero3>numeroMayor){
                numeroMayor=numero3;

            }
            if(numero3<=numeroMenor){
                numeroMenor=numero3;

            }


        }
        System.out.println(numeroMayor+ " "+numeroMenor);
        int cantMayor=0, cantMenor=0;
        numero3=numero;
        numero4=numero;
        for(int j=(i-1);j>0;j--){

            k= (int) Math.pow(10,j);

            numero3=numero4/k;
            numero4=numero4-numero3*k;


            System.out.println(numero3);
            if(numero3==numeroMayor){
                cantMayor++;


            }
            if(numero3==numeroMenor){
                cantMenor++;
            }

            }

        System.out.println("el numero mayor es: "+numeroMayor+ " y " +
                "se repite  "+cantMayor+" , numero menor es igual a "+numeroMenor+
                        " y se repite "+cantMenor);
            System.out.println("");
            */
        Integer num=39629269;
        String numero=num.toString();
       char[] numeros=numero.toCharArray();
       int[] n=new int[numero.length()];

       for(int i=0;i<numero.length();i++) {

           n[i]=Integer.parseInt(Character.toString(numeros[i]));


       }
       int mayor,menor,cantMayor,cantMenor;

        List<Integer> list = new ArrayList<Integer>();
        for (int number : n) {
            list.add(number);
        }

       mayor= Arrays.stream(n).max().getAsInt();
       menor=Arrays.stream(n).min().getAsInt();
        cantMayor=  Collections.frequency(list,mayor);
        cantMenor=Collections.frequency(list,menor);

        System.out.println("el mayor es "+mayor +" y se repite "+cantMayor+" veces");
        System.out.println("el menor es "+menor +" y se repite "+cantMenor+"  veces");
    }
}