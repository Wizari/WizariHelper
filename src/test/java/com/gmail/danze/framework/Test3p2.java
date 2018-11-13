package com.gmail.danze.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3p2 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        int gg = 0;
        for (int z = 10; z <= 99+1; z++) {
            n.add(z);
        }
         // Проверить каждое число numbers на условия задачи
        for (int m = 0; m < n.size() - 1; m++) {
            // из массива "n" взяли 1 число и разбили на массив делителей
            int x[] = DanzeHelper.finAllDividers(n.get(m));
            // просумировать массив и найти % - годно отослать дальше
            for (int j = 0; j < n.size() - 1; j++) {
                if (DanzeHelper.sumAllDivider(x) % 2 == 0) {
                    result.add(n.get(gg));
                    break;
                }
            }
            gg++;
        }
        int[] ret = new int[result.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = result.get(i);
        }
        System.out.println(Arrays.toString(ret));
    }
}