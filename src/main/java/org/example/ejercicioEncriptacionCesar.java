package org.example;

public class ejercicioEncriptacionCesar {
    public static void main(String[] args) {
        String t="hola, como estas.    y";
        char[] text=t.toCharArray();
        char[] cesar=new char[text.length];
        int n=1;

        for(int i = 0; i<text.length;i++){
            cesar[i]=(char) (text[i]+1);
            System.out.println(cesar[i]);



        }
    }
}
