package org.example;

import java.util.ArrayList;
import java.util.List;

public class ejercicioEquiposTodosContraTodos {
    public static void main(String[] args) {
        List<String> equipo1 = new ArrayList<>();
        equipo1.add("a");
        equipo1.add("b");
        equipo1.add("c");
        equipo1.add("d");
        //equipo1.add("e");

        List<String> equipo2 = equipo1;
        List<String> partidos = new ArrayList<>();

        for (int p=0;p<(equipo1.size()-1);p++) {
            partidos.add("\n+"+(p+1)+" temporada ");
            for (int i = p; i < (equipo1.size()-1+p); i = i + 2) {
                for (int j =1+i; j < (equipo1.size()+i); j++) {

                    if((j)>(equipo1.size()-1)){
                        System.out.println(+i+"   "+j+"  "+p+"   "+equipo1.size());
                        partidos.add("partido entre el equipo1 " + equipo1.get(i) + " y " + " equipo2 " + equipo2.get(j-equipo1.size()));

                        break;

                    }else
                        System.out.println(+i+"TTTT"+j+"TTT"+p+"TTT"+equipo1.size());
                    partidos.add("partido entre el equipo1 " + equipo1.get(i) + " y " + " equipo2 " + equipo2.get(j));

                        break;

                }


            }
            System.out.println(p+"\n");
            System.out.println(partidos.toString());

        }


    }

}

