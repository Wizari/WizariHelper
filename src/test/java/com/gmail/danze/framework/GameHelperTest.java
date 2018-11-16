package com.gmail.danze.framework;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GameHelperTest {

    private int area[][];
// Массив с полями еденичками.
    public GameHelperTest() {
        this.area = new int[22][12];
        final int width = area.length;
        final int height = area[0].length;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == 11 || i == 0 || i == 21) {
                    area[i][j] = 1;
                } else if (j != 0 || j != 11 || i != 0 || i != 21) {
                    area[i][j] = 0;
                }
            }
        }
    }


    @Test
    public void rotateTest() {
        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int expected[][] = new int[][]{{0, 0, 0}, {1, 1, 1}, {1, 0, 0}};
        int[][] actual = GameHelper.rotate(array);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void rotate2Test() {
        int array[][] = new int[][]{{1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},};
        int expected[][] = new int[][]{{0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1},};
        int[][] actual = GameHelper.rotate(array);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void rotate3Test() {
        int array[][] = new int[][]{{1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int expected[][] = new int[][]{{0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] actual = GameHelper.rotate(array);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void rotate4Test() {
        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int expected[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int[][] aActual = GameHelper.rotate(array);
        int[][] bActual = GameHelper.rotate(aActual);
        int[][] cActual = GameHelper.rotate(bActual);
        int[][] actual = GameHelper.rotate(cActual);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void moveShareToLeftImpossibleTest() {
        int shape[][] = new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        boolean actual = GameHelper.checkMove(1, 1, this.area, shape, Direction.LEFT);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void moveShareToRightNotImpossibleTest() {

        int shape[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};

        boolean actual = GameHelper.checkMove(-1, -1, this.area, shape, Direction.RIGHT);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void moveShareToDownNotImpossibleTest() {

        int shape[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};

        boolean actual = GameHelper.checkMove(1, 1, this.area, shape, Direction.DOWN);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}