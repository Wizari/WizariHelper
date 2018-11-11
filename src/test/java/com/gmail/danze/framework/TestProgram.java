package com.gmail.danze.framework;

import java.util.Arrays;

public class TestProgram {


    public static void main(String[] args) {
        int arrayLength = DanzeHelper.inputNumber("Введите размер массива");
        int [] res = DanzeHelper.inputLengthIntSequenceFromRandom(arrayLength);
        System.out.println(Arrays.toString(res));

//        int i = DanzeHelper.inputNumber();
    }
}
//   i = DanzeHelper.inputIntSequenceFromUser();
//  res = DanzeHelper.inputLengthIntSequenceFromUser();
////      int sres [] = new int[res.length];
//        int s = DanzeHelper.returnInput();
//        s = DanzeHelper.returnInput();
//        System.out.println(sres);