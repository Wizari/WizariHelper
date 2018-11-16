package com.gmail.danze.framework;

import com.gmail.danze.framework.exceptions.DanzeInfoException;

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

    public static boolean checkMove(int x, int y, int[][] area, int[][] shape, Direction direction) {
        if (area.length <= shape.length) {
            throw new DanzeInfoException("Что та пошло не так фигура больше поля ОМГ лол!!!1111");
        }
        if (x < 0 || y < 0) {
            throw new DanzeInfoException("А координаты то отрицательные! Упс");
        }

        if (direction.equals(Direction.LEFT)) {
            int xLeft = x;
            for (int i = 0; i < shape.length; i++, xLeft++) {
                int yLeft = y - 1;
                for (int j = 0; j < shape[x].length; j++, yLeft++) {
                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
                        return false;
                    }
                }
            }
            return true;
        }
        if (direction.equals(Direction.RIGHT)) {
            int xLeft = x;
            for (int i = 0; i < shape.length; i++, xLeft++) {
                int yLeft = y + 1;
                for (int j = 0; j < shape[x].length; j++, yLeft++) {
                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
                        return false;
                    }
                }
            }
            return true;
        }
        if (direction.equals(Direction.DOWN)) {
            int xLeft = x + 1;
            for (int i = 0; i < shape.length; i++, xLeft++) {
                int yLeft = y;
                for (int j = 0; j < shape[x].length; j++, yLeft++) {
                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
                        return false;
                    }
                }
            }
            return true;
        }

        throw new RuntimeException("Неизвестная Direction");
    }
//        return false;
}





