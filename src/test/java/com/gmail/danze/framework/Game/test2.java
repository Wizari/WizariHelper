package com.gmail.danze.framework.Game;

public class test2 {
    public static void main(String[] args) {
        int area[][] = new int[22][12];
        final int width = area.length;
        final int height = area[0].length;
        for (int i = 0; i < width; i++) {
            System.out.println();
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == 11 || i == 0 || i == 21) {
                    area[i][j] = 1;
                    System.out.print(area[i][j]);
                } else if (j != 0 || j != 11 || i != 0 || i != 21) {
                    area[i][j] = 0;
                    System.out.print(area[i][j]);
                }
            }

        }

    }
}