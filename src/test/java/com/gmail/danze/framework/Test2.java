package com.gmail.danze.framework;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        public static int[] inputLengthIntSequenceFromUser() {
            Scanner scan = new Scanner(System.in);
            int iscan = scan.nextInt();
            int[] array = new int[iscan];
            for (int i = 0; i < iscan; i++) {
                Scanner arrScan = new Scanner(System.in);
                array[i] = arrScan.nextInt();
            }
            System.out.println(Arrays.toString(array));
        }
//        System.out.println(Arrays.toString(a));

    }

