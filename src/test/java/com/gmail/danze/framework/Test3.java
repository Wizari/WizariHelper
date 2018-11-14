package com.gmail.danze.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {


    public static void main(String[] args) {
        String[] f = new String[]{"aaaaa", "aaa aaa"};
//        List<String> items = Arrays.asList(f.split("\\s* \\s*"));
//        String[] subStr;
//        subStr = str.split(delimeter);
        List<String> in = new ArrayList<String>();
//        List<String> deli = new ArrayList<String>();
//        String [] items = f.split(" ");
//        List<String> aitems = Arrays.asList(f.split("\\s*,\\s*"));
//        List<String> container = Arrays.asList(items);
        String delimeter = " ";
//        String [] z;
        String t;
        for (int i = 0; i < f.length; i++) {
            String[] z;
            t = f[i];
            z = t.split(delimeter);
            for (int j = 0; j < z.length; j++) {
                in.add(z[j]);
            }

        }
        System.out.println(in);
    }}