package com.gmail.danze.framework.Game;

public class test3 {
    public static void main(String[] args) {


//    public static boolean checkMove(int xAAA, int yAAA, int[][] areaAAA, int[][] shapeAAA, Direction direction) {
//        Direction direction = new Direction.LEFT;
//        int shape[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};


        int shape[][] = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int area[][] = new int[22][12];
        int x = 1;
        int y = 2;
//        int yM = y -1;
        int yLeft = 0; //shape.length; [0].length;
        int eLeft = 0;
        int g = 0;
//        int area [][] = new int[][]{{1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}};
        final int width = area.length;
        final int height = area[0].length;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
//                if (j == 0 || j == 11 || i == 0 || i == 21) {
//                    area[i][j] = 1;
//                } else if (j != 0 || j != 11 || i != 0 || i != 21) {
//                    area[i][j] = 0;
                if (j != 0 || j != 11 || i != 0 || i != 21) {
                    area[i][j] = 0;
                } else if (j == 0 || j == 11 || i == 0 || i == 21) {
                    area[i][j] = 1;
                }
            }
        }

    for (int i = x; i < x + shape.length; i++) {
        int k = 0;
                g++;
        for (int j = y; j < y + shape[0].length; j++) {
            k++;
            int h = area[i][j];
            int h2 = shape[g][k];
            int h3 = h + h2;
//                    area[i][j] += shape[g][k];
            if (h3 == 2) {
                System.out.println(area[i][j]);
                System.out.println("False1");
//            if ((area[i][j] += shape[g][k]) == 2) {
//                System.out.println(area[i][j]);
//                System.out.println("False1");

            }
            else {
                System.out.println(area[i][j]);
            }
        }
//        g++;
    }
//        System.out.println(area[i][j]);
        System.out.println("True1");
}

}
