package com.gmail.danze.framework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DanzeHelperTest {
    // @Test Нужен над каждым методом тестового класса
    @Test
    public void concat2ArraysTest() {
        int a[] = new int[]{1, 2};
        int b[] = new int[]{3, 4};

        int[] result = DanzeHelper.concatArrays(a, b);

        int[] expectedArray = new int[]{1, 2, 3, 4};

        for (int i = 0; i < result.length; i++) {
            assertEquals(expectedArray[i], result[i]);
        }
    }

    @Test
    public void concat2ArraysWrongResultTest() {
        int a[] = new int[]{1, 2};
        int b[] = new int[]{3, 4};
        int[] result = DanzeHelper.concatArrays(a, b);
        int[] expectedArray = new int[]{1, 2, 3, 5};
        assertEquals(expectedArray[0], result[0]);
        assertEquals(expectedArray[1], result[1]);
        assertEquals(expectedArray[2], result[2]);
        assertNotEquals(expectedArray[3], result[3]);
    }

    @Test
    public void findAllDividersTest() {
        int number = 10;
        int[] expected = new int[]{1, 2, 5, 10};
        int[] actual = DanzeHelper.finAllDividers(number);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }


    @Test
    public void checkEvenDividerTest() {
        int[] array = new int[]{1, 2, 2, 5, 4};
        int[] actual = DanzeHelper.checkEvenDivider(array);
        int[] expected = new int[]{2, 2, 4};

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
    }

//    @Test
//    public void addOneInArrTest() {
//        int[] dividers = new int[]{1, 2, 5, 10};
//        boolean actual = DanzeHelper.checkEvenDivider(dividers);
//        boolean expected = true;
//        assertEquals(expected, actual);
//    }

//        @Test
//    public void inputStringSequenceFromUseTest() {
//            String [] dividers = new String[]{"1", "2", "3", "q"};
//            int [] actual = new int[dividers.length];
//            actual = {DanzeHelper.creatorArrIntStopQq}
//            boolean expected = true;
//            assertEquals(expected, actual);
//        }

    @Test
    public void findMinElementTest() {
        int[] array = new int[]{5, 1, 3};
        int actual = DanzeHelper.findMinimumFromArray(array);
        assertEquals(1, actual);
    }

    @Test
    public void sumAllDividerTest() {
        int[] array = new int[]{1, 2, 3};
        int actual = DanzeHelper.sumAllDivider(array);

        assertEquals(6, actual);
    }
}


