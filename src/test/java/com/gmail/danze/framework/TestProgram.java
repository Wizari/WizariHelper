package com.gmail.danze.framework;

import java.util.Arrays;

public class TestProgram {


    public static void main(String[] args) {
//      i = DanzeHelper.inputIntSequenceFromUser();
        int [] res = DanzeHelper.inputLengthIntSequenceFromUser();
//      res = DanzeHelper.inputLengthIntSequenceFromUser();
//      int sres [] = new int[res.length];
//        int s = DanzeHelper.returnInput();
//        s = DanzeHelper.returnInput();
//        System.out.println(sres);
        System.out.println(Arrays.toString(res));
    }
}
