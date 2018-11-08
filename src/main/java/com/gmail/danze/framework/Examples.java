package com.gmail.danze.framework;

public class Examples {


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

