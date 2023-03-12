package org.example;

/*
 *
 * dada una cadena y una sub cadena decir si es sufijo o prefijo*/
public class ejercicio23 {

    public static String comprobar(String c, String s) {
        char[] cadena = c.toCharArray();
        char[] sub = s.toCharArray();
        String resul = "";

        for (int i = 0; i < s.length() - 1; i++) {

            if (cadena[i] == sub[i]) {

                if (cadena[sub.length - 1] == sub[sub.length - 1]) {

                    resul = "es prefijo";
                    return resul;
                }


            }
        }

        for (int i = c.length() - 1; i >= c.length() - s.length() ; i--) {



            if (cadena[i] == sub[i-c.length()+s.length()]) {


                if (cadena[c.length() - s.length()] == sub[0]) {
                    resul = "es sufijo";

                   return resul;
                }


            }

        }
        return "no es prefijo ni sufijo";
    }
        public static void main (String[]args){
            String cadenas, subcadena, resultado;
            cadenas = "imposibles";
            subcadena = "im";

            resultado = comprobar(cadenas, subcadena);
            System.out.println(resultado);


        }


    }
