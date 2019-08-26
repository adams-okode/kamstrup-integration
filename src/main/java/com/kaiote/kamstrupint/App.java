package com.kaiote.kamstrupint;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        String key = args[0];
        String message = args[1];
        try {
            Kamstrup kamstrup = new Kamstrup(key, message);
            kamstrup.toString();
            // Kamstrup kamstrup = new Kamstrup("353822AAC8268976952DC4AD2F9FFEF3",
            // "c107138f67c5399441bd137a");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
