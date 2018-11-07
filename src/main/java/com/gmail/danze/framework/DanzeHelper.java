package com.gmail.danze.framework;

import java.util.Random;

public class DanzeHelper {
//Пререворот строки
    public static String reverseLine(String line) {
        String result = new StringBuffer(line).reverse().toString();
        return result;
    }
//рандом возможно нужен import java.util.Random;
    public static int  generateRandom(int min, int max) {
        Random rnd = new Random();
        int number = min + rnd.nextInt(max - min + 1);
        return number;
    }
//    -1+1
    public static char  thereAndHere(char downOne, char upOne) {
        char a = 'c' - 1;
        System.out.println(a);
        char b = 'c' + 1;
        System.out.println(b);
        return thereAndHere(a, b);
    }
}
