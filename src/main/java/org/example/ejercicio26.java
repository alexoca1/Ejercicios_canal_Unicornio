package org.example;

public class ejercicio26 {

    public static void main(String[] args) {
        String texto="     hola, - estoy haciendo una prueba. - ok";
        texto=texto.replace("-","");
        System.out.println(texto);
        int cont=0;
        char[] t=texto.toCharArray();
        int i=0;
        for(int j=0;j<t.length;j++){
            if(t[j]!=' '){
                break;
            }
            i++;
        }
        while(i<t.length){


            if(t[i]==' '){
                cont++;
                for(int k=i;k<t.length;k++){
                    if(t[k]!=' '){
                        break;
                    }
                    i++;
                }
            }
            i++;
        }
        cont=cont+1;
        System.out.println("el numero de palabras "+cont);


    }

}
