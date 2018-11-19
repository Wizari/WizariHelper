package com.gmail.danze.framework.game;


import com.r78.game.GameAreaPanel;

import javax.swing.*;

public class RunGame {

    public static void main(String[] args) {
//        int[][] gameArea = new int[][]{
////                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
////                {1, 1, 1, 1, 0, 1, 1, 1, 1,1},
////        };
//        I, S, Z, O, L, J, T;
//        public final int[][] iShape = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0},};
//        final int[][] oShape = new int[][]{{1, 1}, {1, 1}};
//
//        final int[][] lShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
//        final int[][] jShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {1, 1, 0}};
//
//        final int[][] sShape = new int[][]{{0, 1, 1}, {1, 1, 0}, {0, 0, 0}};
//        final int[][] zShape = new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 0, 0}};
//        final int[][] tShape = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};

        final int[][] iShape = new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0},};
        final int[][] oShape = new int[][]{{1, 1}, {1, 1}};

        final int[][] lShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        final int[][] jShape = new int[][]{{0, 1, 0}, {0, 1, 0}, {1, 1, 0}};

        final int[][] sShape = new int[][]{{0, 1, 1}, {1, 1, 0}, {0, 0, 0}};
        final int[][] zShape = new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 0, 0}};
        final int[][] tShape = new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 0, 0}};

        int[][] gameArea = new int[22][12];
        final int width = gameArea.length;
        final int height = gameArea[0].length;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == 11 || i == 0 || i == 21) {
                    gameArea[i][j] = 1;
                } else if (j != 0 || j != 11 || i != 0 || i != 21) {
                    gameArea[i][j] = 0;
                }
            }
        }

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(50, 50, 200, 70);


        GameAreaPanel panel = new GameAreaPanel(12, 22);
        panel.setBounds(100, 50, panel.WIDTH * panel.POINT_SIZE, panel.HEIGHT * panel.POINT_SIZE);
        panel.updateGameArea(gameArea);

//        JPanel panel = new JPanel();
//        panel.setLayout(null);
//        panel.add(exitButton);

        JFrame frame = new JFrame("TETRIS");
        frame.setLayout(null);
        frame.setSize(600, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        exitButton.addActionListener(e -> {
            frame.dispose();
        });


    }

}
