package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ejercicio7 {
    public static void main(String[] args) {


        int num = 348576;
        int n = 3;
        String a = Integer.toString(num);
        char[] b = a.toCharArray();
        int[] c = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            c[i] = Integer.parseInt(String.valueOf(b[i]));

        }
        int[] numero = new int[c.length];
        int i = 0;
        int m = 0;
        int cant = 0;
        //while(m<n){
        //   m++;
        //   System.out.println(Arrays.toString(numero)+"--");
        //   System.out.println(Arrays.toString(c)+"--");

        for (int j = 0; j < c.length; j++) {
            if ((j + n) > (c.length - 1)) {
                numero[cant] = c[j];
                cant++;


            } else {

                //  System.out.println(numero[j+1]+"---"+c[j]);
                numero[j + n] = c[j];
                //System.out.println(numero[j+1]+"==="+c[j]);

                //  }


            }


        }

        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(c));


    }
}
