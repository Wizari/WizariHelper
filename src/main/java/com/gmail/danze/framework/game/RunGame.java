package com.gmail.danze.framework.game;


import javax.swing.*;
import java.awt.*;

public class RunGame {

    public static void main(String[] args) {

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(50, 50, 200, 70);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(exitButton);

        JFrame frame = new JFrame("TETRIS");
        frame.setSize(600,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        exitButton.addActionListener(e -> {
            frame.dispose();
        });


    }

}
