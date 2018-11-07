package com.gmail.danze.framework;

import java.util.Random;

public class DanzeHelper {

    public static String reverseLine(String line) {
        String result = new StringBuffer(line).reverse().toString();
        return result;
    }

    public static int  generateRandom(int min, int max) {
        Random rnd = new Random();
        int number = min + rnd.nextInt(max - min + 1);
        return number;
    }
    public static char  thereAndHere(char downOne, char upOne) {
        char a = 'c' - 1;
        System.out.println(a);
        char b = 'c' + 1;
        System.out.println(b);
        return thereAndHere(a, b);
    }
}
