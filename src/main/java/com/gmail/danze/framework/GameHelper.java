package com.gmail.danze.framework;

public class GameHelper {

    /**
     * вращает матрицу по часовой стрелке на 90 градусов
     *
     * @param shape матрица до вращения
     * @return матрица после вращения
     */
    public static int[][] rotate(int[][] shape) {
//        int[][] share = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int[][] rotate = new int[shape.length][shape.length];
        int m = shape.length;
        int k = -1;
        for (int i = 0; i < shape.length; i++) {
            m--;
            k++;
            for (int aaa = 0; aaa < shape.length; aaa++) {
                rotate[aaa][m] = shape[k][aaa];
            }
        }
        return rotate;
    }
}





