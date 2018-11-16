package com.gmail.danze.framework.Game;

public class checkMove {
    //    public static boolean xaxa(int xx) {
    public static void main(String[] args) {


//    public static boolean checkMove(int xAAA, int yAAA, int[][] areaAAA, int[][] shapeAAA, Direction direction) {
//        Direction direction = new Direction.LEFT;
//        int shape[][] = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int shape[][] = new int[][]{{1, 1, 1}, {0, 1, 1}, {0, 1, 1}};
        int area[][] = new int[22][12];
        int x = 2;
        int y = 1;
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

//      if (direction.equals(Direction.LEFT)) {
        if (y == 1) {
            int xLeft = x; //shape.length; [0].length;
            for (int i = 0; i < shape.length; i++, xLeft++) {
                int yLeft = y - 1;
                for (int j = 0; j < shape[x].length; j++, yLeft++) {
                    if  ((area[xLeft][yLeft] += shape[i][j])== 2){
                        System.out.println(area[i][j]);
                        System.out.println("False1");
                    }
//                    k++;
//                    area[i][j] += shape[g][k];
//                    if (area[i][j] == 2) {
//                        System.out.println("False1");
//
//                    }
//                    else if (area[i][j] != 2){
//                        System.out.println("true");
//                    }
                }
//                g++;
            }
//            return true;
            System.out.println("true");
        }
//        System.out.println("true");
    }
}



