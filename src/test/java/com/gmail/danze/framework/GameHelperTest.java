package com.gmail.danze.framework;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GameHelperTest {

    @Test
    public void rotate() {
        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int expected [][] = new  int[][] {{0, 0, 0}, {1, 1, 1}, {1, 0, 0}};
        int[][] actual = GameHelper.rotate(array);
        assertTrue(Arrays.deepEquals(expected, actual));
    }
}