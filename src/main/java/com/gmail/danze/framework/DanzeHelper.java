package com.gmail.danze.framework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Нажать Clear > install
public class DanzeHelper {

    //Такие комернтарии позволяют автоматически генерировать документацию

    /**
     * Этот метод переворачивает строку
     *
     * @param line строка для переворота
     * @return перевернутая строка
     */
    public static String reverseLine(String line) {
        String result = new StringBuffer(line).reverse().toString();
        return result;
    }

    //рандом возможно нужен import java.util.Random;
    public static int generateRandom(int min, int max) {
        Random rnd = new Random();
        int number = min + rnd.nextInt(max - min + 1);
        return number;
    }

    //    -1+1
    public static char thereAndHere(char downOne, char upOne) {
        char a = 'c' - 1;
        System.out.println(a);
        char b = 'c' + 1;
        System.out.println(b);
        return thereAndHere(a, b);
    }

    public static int inputNumber() {
        System.out.print("Ввведите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    /**
     * Позволяет ввести несколько чисел
     *
     * @param numbersAmount количество чисел
     * @return массив введенных чисел
     */
    public static int[] inputNumbers(int numbersAmount) {
        int[] numbers = new int[numbersAmount];
        for (int i = 0; i < numbersAmount; i++) {
            int num = inputNumber();
            numbers[i] = num;
        }
        return numbers;
    }

    public static int[] inputSequenceNumbers() {
        System.out.print("Введите последовательность разделяя пробелами. Enter для заврешения: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" "); //разбить строку на части(слова) по пробелу
        System.out.println("Получилась такая последовательность слов: " + Arrays.toString(words));
        int length = words.length; //кол-во получившихся слов
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(words[i]); //Превращаем слово в число
        }
        return numbers;
    }

    public static int[] concatArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[index++] = b[i];
        }
        return c;
    }

    public static int[] inputNumbersZeroForExit() {
        int[] result = new int[0];
        while (true){
            int number = inputNumber();
            if (number == 0) {
                return result;
            }
            int[] temp = {number};
            result = concatArrays(result, temp);
        }
    }

    public static String arrayToString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length - 1; i++) {
            result = result + array[i] + ", ";
        }
        result = result + array[array.length - 1];
        result = result + "]";
        return result;
    }

    public static int[] finAllDividers(int number) {
        return null;
    }

    /**
     * Проверка четности суммы элементов массива
     * @param array массив для провреки
     * @return резульат проверки
     */
    public static boolean checkEvenDivider(int[] array) {
        return false;
    }
}
