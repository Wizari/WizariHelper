package com.gmail.danze.framework;

import java.util.Arrays;

public class Examples {

    // Примеры

//    alt+insert - мини меню...

//    shift+f6 изменить названия переменной во всех полях

//Справка по полю Cntrl + p

//    при ошибке Arrays [Ljava.lang.String; [I@32a1bec0
//    System.out.println(Arrays.toString(strings));

// Копирование массива с уменьшением на 1 ячейку
//    String x [] = Arrays.copyOf(y,y.length - 1);

//    Универсальный массив и его преобразование в String массив
//List<String> myList = new ArrayList<String>();
//String[] y = myList.toArray(new String[0]);
//    Не ок пахали

//int[] arr = myList.stream().mapToInt(i -> i);
//int[]  arr = myList.stream().filter(i -> i != null).mapToInt(i -> Integer.parseInt(i)).toArray(); //[1, 3, 4]





    public static void main(String[] args) {
//            System.out.println("Этот метод запускается при старте программы, и является основной программой");
        method1();
        method2("Hello world");
        int result = method3(2, 2);
        System.out.println("Результат работы method3 " + result);
    }

    private static int method3(int a, int b) {
        System.out.println("Этот метод умеет складывать a и b, и возвращать результат вычислений основной программе");
        return a + b;
    }


    static void method2(String message) {
        System.out.println("Этот метод выведет на экран ту строку, которую в него передали");
        System.out.println(message);
    }


    private static void method1() {
        System.out.println("Этот метод просто что-то выводит на экран");
    }
}

