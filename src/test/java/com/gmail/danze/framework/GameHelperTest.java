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

        boolean actual = GameHelper.checkMove(15, 5, this.area, shape, Direction.RIGHT);
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

    @Test
    public void moveShareToLeftImpossible2Test() {

        int shape[][] = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0},};

        boolean actual = GameHelper.checkMove(1, 0, this.area, shape, Direction.LEFT);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void moveShareToLeftNotImpossible2Test() {

        int shape[][] = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0},};

        boolean actual = GameHelper.checkMove(15, 0, this.area, shape, Direction.LEFT);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void moveShareToRightImpossible2Test() {

        int shape[][] = new int[][]{{0, 1, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},};

        boolean actual = GameHelper.checkMove(15, 8, this.area, shape, Direction.RIGHT);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void moveShareToRightNotImpossible2Test() {

        int shape[][] = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0},};

        boolean actual = GameHelper.checkMove(1, 8, this.area, shape, Direction.RIGHT);
        boolean expected = false;

        assertEquals(expected, actual);
    }


    @Test
    public void moveShareToDownNotImpossible2Test() {

        int shape[][] = new int[][]{{0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0},};

        boolean actual = GameHelper.checkMove(19, 1, this.area, shape, Direction.DOWN);
        boolean expected = false;

        assertEquals(expected, actual);
    }



    /////////////////////////////////////////////////////////////////

    @Test
    public void rotateFigureITest() {

        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int expected[][] = new int[][]{{0, 0, 0}, {1, 1, 1}, {1, 0, 0}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.L);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void rotateFigureOTest() {

        int array[][] = new int[][]{{1, 1}, {1, 1}};
        int expected[][] = new int[][]{{1, 1}, {1, 1}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.O);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void rotateFigureJTest() {

        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {1, 1, 0}};
        int expected[][] = new int[][]{{1, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.J);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void rotateFigureSTest() {

        int array[][] = new int[][]{{0, 1, 1}, {1, 1, 0}, {0, 0, 0}};
        int expected[][] = new int[][]{{0, 1, 0}, {0, 1, 1}, {0, 0, 1}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.S);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


//    @Test
//    public void notRotateFigureSTest() {
//
//        int array[][] = new int[][]{{0, 1, 1}, {1, 1, 0}, {0, 0, 0}};
//        int expected[][] = new int[][]{{0, 1, 0}, {0, 1, 1}, {0, 0, 1}};
//        int[][] actual = GameHelper.rotateFigure(array, Figure.S);
////        assertNotEquals(array[][]);
////        assertTrue(Arrays.deepEquals(expected, actual));
//        assertNotEquals(expected[0][2], actual[0][2]);
//    }


    @Test
    public void rotateFigureZTest() {

        int array[][] = new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 0, 0}};
        int expected[][] = new int[][]{{0, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.Z);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void rotateFigureTTest() {

        int array[][] = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};
        int expected[][] = new int[][]{{0, 1, 0}, {0, 1, 1}, {0, 1, 0}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.T);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void rotateFigureLTest() {

        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int expected[][] = new int[][]{{0, 0, 0}, {1, 1, 1}, {1, 0, 0}};
        int[][] actual = GameHelper.rotateFigure(array, Figure.L);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void rotateFigureL2Test() {

        int array[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int expected[][] = new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};

        int[][] aActual = GameHelper.rotateFigure(array, Figure.L);
        int[][] actual = GameHelper.rotateFigure(aActual, Figure.L);

        assertTrue(Arrays.deepEquals(expected, actual));
    }
}