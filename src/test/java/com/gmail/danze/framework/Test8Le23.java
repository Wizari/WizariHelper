package com.gmail.danze.framework;
/**Составить программу, удаляющую одну цифру из N-значного числа,
 *  такую, чтобы плюс-минус сумма была наибольшей. Плюс-минус
 *  сумма – это сумма с чередованием цифр числа с разными знаками:
 *  для числа 764 это +7-6+4. Если удалить цифру 7, то будет +6-4=2,
 *  если удалить цифру 6, то будет +7-4=3, если удалить цифру 4,
 *  то будет +7-6=1. При этом видно, что максимум достигается при
 *  удалении средней цифры 6 и равен 3.

 Входные данные
 Записано натуральное N-значное число (2 ≤ N ≤ 50).*/

import java.util.ArrayList;
import java.util.List;

public class Test8Le23 {
    public static void main(String[] args) {
        int kk = 123;
        List<StringBuilder> ee = new ArrayList<>();
//        StringBuilder s = new StringBuilder();
//        String
        for (int a = kk; a > 0; a /= 10) {
            int v = 0;
            StringBuilder s = new StringBuilder();
//            s.insert(0, a % 10);

//            String s2 = kk.split("\\\D+");
//            String[] y = s.toArray(new String[0]);
//            ee = v
            ee.add(s.insert(0, a % 10));

        }

//        ee.add(s);
        System.out.println(ee);
    }
}