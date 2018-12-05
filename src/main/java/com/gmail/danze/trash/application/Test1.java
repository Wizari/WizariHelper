package com.gmail.danze.trash.application;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        JFrame gameWindow = new JFrame("AAA");
        gameWindow.setSize(800, 800);
        gameWindow.setLayout(null);
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setVisible(true);
        JButton button = new JButton("Button");

        gameWindow.add(button);
        button.setBounds(10, 10, 50, 100);
        button.setFocusPainted(false);
    }
}