package com.gmail.danze.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {


    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        int gg = 0;
        // Создать массив от 10 до 99
        int z = 10;
        while (z < 20){
            z++;
//        for (int z = 10; z < 20; z++) {
            n.add(z);
    }
//        }
//        int gg = 0;
//        int tt = 0;
        // Проверить каждое число numbers на условия задачи
        for (int m = 0; m < n.size() - 1; m++) {

            // из массива "n" взяли 1 число и разбили на массив делителей
            int x[] = DanzeHelper.finAllDividers(n.get(m));
            // просумировать массив и найти % - годно отослать дальше
            for (int j = 0; j < n.size() - 1; j++) {

                int k = DanzeHelper.sumAllDivider(x);
                if (k % 2 == 0) {
                    result.add(n.get(gg));
                }
            }
            gg++;
        }

//        int[] ret = result.stream().mapToInt(Integer::intValue).toArray();
        int[] ret = new int[result.size()];
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = result.get(i).intValue();
        }
        System.out.println(DanzeHelper.arrayToString(ret));
//        int[] fresult = Arrays.copyOf(result.size());
//        result [] =
//        int[] fresult = new int[x.length];
//        for (int i = 0; i < result.length; i++)
//            fresult[i] = Integer.parseInt(result[i].trim());

    }

            }
//            x [0] = Arrays.copyOf(n [i]);
//            int[] result = new int[x.length];
//            for (int i = 0; i < result.length; i++)
//                result[i] = Integer.parseInt(x[i].trim());


//            DanzeHelper.finAllDividers(numbers [i]);
//            int [] a = new int[DanzeHelper.finAllDividers(numbers [i])];
//            DanzeHelper.finAllDividers(numbers [i]);
//            for (int i = 0; i < ; i++){
//
//            }
//            // Проверить все делители
////            checkEvenDivider
//
//        }
//
//    }

//        int[] array = new int[]{1, 2, 5, 10, 13};
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i <= array.length - 1; i++) {
//
//            if (array[i] % 2 == 0) {
//                result.add(array[i]);
//            }
//        }
//        int[] ints = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            ints[i] = result.get(i);
//        }
////        return ints;
//        System.out.println(Arrays.toString(ints));
//    }
//}
