package com.gmail.danze.trash.application;

import java.util.*;

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
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
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

    // при получении 0 завершает цикл
    public static int[] inputNumbersZeroForExit() {
        int[] result = new int[0];
        while (true) {
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
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        return ints;
    }

    /**
     * Проверка четности суммы элементов массива
     *
     * @param array массив для провреки
     * @return резульат проверки
     */
    public static int[] checkEvenDivider(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= array.length - 1; i++) {

            if (array[i] % 2 == 0) {
                result.add(array[i]);
            }
        }
        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        return ints;
    }

    public static int sumAllDivider(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
        sum += array[i];
        }
        return sum;
    }


    /**
     * Добавляем число к полному массиву
     *
     * @param add добавляем
     * @return новый массив
     */
//    public static boolean addOneInArr(int[] add) {
//        return false;
//    }


    /**
     * создает массив String. принимает по одному. остановить "q"
     *
     * @param
     * @return
     */
    public static String[] inputStringSequenceFromUser(String exitCommand) {
        Scanner scan = new Scanner(System.in);
        List<String> myList = new ArrayList<String>();

        for (; ; ) {
            String a = scan.nextLine();
            myList.add(a);
            if (a.equals(exitCommand)) {
                String[] y = myList.toArray(new String[0]);
                String x[] = Arrays.copyOf(y, y.length - 1);
                return x;
            }
        }
    }

    /**
     * Принимает символы по одному и создает массив. Остановка по "q"
     *
     * @return массив в
     */
    public static int[] inputIntSequenceFromUser(String exitCommand) {
        Scanner scan = new Scanner(System.in);
            List<String> myList = new ArrayList<String>();

        for (; ; ) {
            String a = scan.nextLine();
            if (a.equals(exitCommand)) {
                String[] y = myList.toArray(new String[0]);
                String x[] = Arrays.copyOf(y, y.length - 1);
                int[] result = new int[x.length];
                for (int i = 0; i < result.length; i++)
                    result[i] = Integer.parseInt(x[i].trim());
                return result;
            }
            myList.add(a);
        }
    }

//    public static int[] inputIntSequenceFromUserUsingList() {
//        Scanner scan = new Scanner(System.in);
//        List<String> myList = new ArrayList<String>();
//
//        while (true) {
//            String a = scan.nextLine();
//            myList.add(a);
//            if (a.equals("q")) {
//                String[] y = myList.toArray(new String[0]);
//                String x[] = Arrays.copyOf(y, y.length - 1);
//                int[] result = Arrays.stream(x).mapToInt(Integer::parseInt).toArray();
//                return result;
//            }
//        }
//    }


    public static int findMinimumFromArray(int[] array) {
        Arrays.sort(array);
        int sarray[] = Arrays.copyOf(array, 0);
        int result = 0;
        if (result == 0) {
            result = result + array[0];
        }
        return result;
    }

    public static int inputNumber() {
        System.out.print("Ввведите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int inputNumber(String promptMessage) {
        System.out.print(promptMessage);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    /**
     * Запрашивает нужный размер массива int и числа по одному.
     * первый запрос размер массива
     *
     * @return массив
     */
    public static int[] inputLengthIntSequenceFromUser(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = DanzeHelper.inputNumber("Введите " + (i + 1) + "-ое число из " + length + ": ");
        }
        return array;
    }

    /**
     * Запрашивает нужный размер массива int и числа по одному.
     * первый запрос размер массива
     *
     * @return массив
     */
    public static int[] inputLengthIntSequenceFromRandom(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите " + (i + 1) + "-ое число из " + length + ": ");
            int random = generateRandom(0, 100);
            System.out.println(random);
            array[i] = random;
        }
        return array;
    }

}


