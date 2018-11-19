package com.gmail.danze.framework;

import com.gmail.danze.framework.exceptions.DanzeInfoException;

import java.util.List;

public class GameHelper {
//    public final int[][] iShape = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0},};
//    public final int[][] oShape = new int[][]{{1, 1}, {1, 1}};
//
//    final int[][] lShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
//    final int[][] jShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {1, 1, 0}};
//
//    final int[][] sShape = new int[][]{{0, 1, 1}, {1, 1, 0}, {0, 0, 0}};
//    final int[][] zShape = new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 0, 0}};
//    final int[][] tShape = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};

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

    /**
     * вращает матрицу по часовой стрелке на 90 градусов
     */
//    List<Shape>
    public static int[][] rotateFigure(int[][] shape, Figure figure) {
        final int[][] iShape = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0},};
        final int[][] oShape = new int[][]{{1, 1}, {1, 1}};

        final int[][] lShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        final int[][] jShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {1, 1, 0}};

        final int[][] sShape = new int[][]{{0, 1, 1}, {1, 1, 0}, {0, 0, 0}};
        final int[][] zShape = new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 0, 0}};
        final int[][] tShape = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};

        int[][] rotate = new int[shape.length][shape.length];
        int m = shape.length;
        int k = -1;
//        int iShape [][] =
//        I, O, L, J, S, Z, T;
        if (figure.equals(Figure.I)) {
            if (shape[0][2] == iShape[0][2]) {
                for (int i = 0; i < shape.length; i++) {
                    m--;
                    k++;
                    for (int aaa = 0; aaa < shape.length; aaa++) {
                        rotate[aaa][m] = shape[k][aaa];
                    }
                }
                return rotate;
            }
            if (shape[0][2] != iShape[0][2]) {
                return iShape;
            }
        }


        if (figure.equals(Figure.S)) {
            if (shape[0][0] == sShape[0][0]) {
                for (int i = 0; i < shape.length; i++) {
                    m--;
                    k++;
                    for (int aaa = 0; aaa < shape.length; aaa++) {
                        rotate[aaa][m] = shape[k][aaa];
                    }
                }
                return rotate;
            }
            if (shape[0][0] != sShape[0][0]) {
                return sShape;
            }
        }


        if (figure.equals(Figure.Z)) {
            if (shape[2][2] == zShape[2][2]) {
                for (int i = 0; i < shape.length; i++) {
                    m--;
                    k++;
                    for (int aaa = 0; aaa < shape.length; aaa++) {
                        rotate[aaa][m] = shape[k][aaa];
                    }
                }
                return rotate;
            }
            if (shape[0][0] != sShape[0][0]) {
                return zShape;
            }
        }


        if (figure.equals(Figure.O)) {
            return oShape;
        }
        if (figure.equals(Figure.L)) {
            for (int i = 0; i < shape.length; i++) {
                m--;
                k++;
                for (int aaa = 0; aaa < shape.length; aaa++) {
                    rotate[aaa][m] = shape[k][aaa];
                }
            }
            return rotate;
        }
        if (figure.equals(Figure.J)) {
            for (int i = 0; i < shape.length; i++) {
                m--;
                k++;
                for (int aaa = 0; aaa < shape.length; aaa++) {
                    rotate[aaa][m] = shape[k][aaa];
                }
            }
            return rotate;
        }
        if (figure.equals(Figure.T)) {
            for (int i = 0; i < shape.length; i++) {
                m--;
                k++;
                for (int aaa = 0; aaa < shape.length; aaa++) {
                    rotate[aaa][m] = shape[k][aaa];
                }
            }
            return rotate;
        }
        throw new RuntimeException("Неизвестная Figure");

    }





//        int[][] share = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
//        int[][] rotate = new int[shape.length][shape.length];
//        int m = shape.length;
//        int k = -1;
//        for (int i = 0; i < shape.length; i++) {
//            m--;
//            k++;
//            for (int aaa = 0; aaa < shape.length; aaa++) {
//                rotate[aaa][m] = shape[k][aaa];
//            }
//        }
//        return rotate;
//    }




    /** метод для проверки - можно ли объекту переместится в запрошенном направлении.
     *
     * @param x координаты начального положения "shape" фигуры.
     *          верхний левый угол "shape" матрицы.
     * @param y
     * @param area Зона внутри которой  происходит перемещение "shape"
     * @param shape перемещяемая матрица
     * @param direction
     * @return
     */

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
                for (int j = 0; j < shape[0].length; j++, yLeft++) {
                    if (yLeft == -1) {
                        continue;
                    }
                    else if  ((area[xLeft][yLeft] += shape[i][j])== 2){
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
                for (int j = 0; j < shape[0].length; j++, yLeft++) {
                    if (yLeft > area[0].length-1) {
                        continue;
                    }
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
                for (int j = 0; j < shape[0].length; j++, yLeft++) {
                    if (xLeft > area.length-1) {
                        continue;
                    }
                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
                        return false;
                    }
                }
            }
            return true;
        }

        throw new RuntimeException("Неизвестная Direction");
    }



//    public static boolean checkMove(int x, int y, int[][] area, int[][] shape, Direction direction) {
//        if (area.length <= shape.length) {
//            throw new DanzeInfoException("Что та пошло не так фигура больше поля ОМГ лол!!!1111");
//        }
//        if (x < 0 || y < 0) {
//            throw new DanzeInfoException("А координаты то отрицательные! Упс");
//        }
//
//        if (direction.equals(Direction.LEFT)) {
//            int xLeft = x;
//            for (int i = 0; i < shape.length; i++, xLeft++) {
//                int yLeft = y - 1;
//                for (int j = 0; j < shape[x].length; j++, yLeft++) {
//                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//        if (direction.equals(Direction.RIGHT)) {
//            int xLeft = x;
//            for (int i = 0; i < shape.length; i++, xLeft++) {
//                int yLeft = y + 1;
//                for (int j = 0; j < shape[x].length; j++, yLeft++) {
//                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//        if (direction.equals(Direction.DOWN)) {
//            int xLeft = x + 1;
//            for (int i = 0; i < shape.length; i++, xLeft++) {
//                int yLeft = y;
//                for (int j = 0; j < shape[x].length; j++, yLeft++) {
//                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//
//        throw new RuntimeException("Неизвестная Direction");
//    }
}





