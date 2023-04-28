package com.mateussilva.java.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Transcricao {

    /*
     * Autor: Mateus José da Silva n° 23
     *
     * Input: Fita de DNA
     * Output: RNA mensageiro
     * Teste: GGC.CGA.TTA.ATG.CTT.AAA.TGC.GGC.CTA.AAT.TAT
     */

    public static void main(String[] args) {

        try {
            String anti_sense, rna = "";

            BufferedReader entrada = new BufferedReader(
                    new FileReader("src//com//mateussilva//java//main//entrada(Transcricao).txt"));
            anti_sense = entrada.readLine();
            entrada.close();
            anti_sense = anti_sense.toUpperCase();

            for (int i = 0; i < anti_sense.length(); i++) {
                switch (anti_sense.charAt(i)) {
                    case '.' -> rna += ".";
                    case 'A' -> rna += "U";
                    case 'G' -> rna += "C";
                    case 'T' -> rna += "A";
                    case 'C' -> rna += "G";
                }
            }

            BufferedWriter saida = new BufferedWriter(
                    new FileWriter("src//com//mateussilva//java//main//saida(Transcricao)-Mateus_Jose_da_Silva.txt"));
            saida.write(rna);
            saida.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
