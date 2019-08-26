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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
