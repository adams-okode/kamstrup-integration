package com.kaiote.kamstrupint;

/**
 * Hello world!
 *
 */
public class App {
   
    public static void main(String[] args) {
        try {
            Kamstrup kamstrup = new Kamstrup("C2E387277E39C9D821F3B05E1616F87C", "c164ed406d8d6f1d8715f739");
            kamstrup.getDataTypeParameters();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
