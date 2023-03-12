package org.example;

public class ejercicio18 {
    public static void main(String[] args) {
        long n=43843292;
        String num=Long.toString(n);
        char[] numero=num.toCharArray();
        int div= (numero.length%2);
        int a,b,c,a1,b1,c1;
        if(div==0){
            a=(numero.length/2)-1;
            b=(numero.length/2);
            a1=Integer.parseInt(String.valueOf(numero[a]));
            b1=Integer.parseInt(String.valueOf(numero[b]));
            c1=a1+b1;




        }else{
            c=(numero.length)/2;
            c1=Integer.parseInt(String.valueOf(numero[c]));
            System.out.println(c1);

       }
       if(c1%3==0){

           System.out.println("el numero "+n+" es unicornio");
       }else{

           System.out.println("no es un unicornio");
       }

    }
}
