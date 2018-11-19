package com.gmail.danze.framework.ui;

import javax.swing.*;

public class BlackJWindow extends JFrame {

    public BlackJWindow() {
        super("Black Jack");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 800);
        setLocationRelativeTo(null);
        JButton exitButton = new JButton("EXIT");
//        JButton newButton = new JButton();
        exitButton.setBounds(50, 50, 200, 70);
//        setLayout();
        getContentPane().add(exitButton);




        //        JFrame frame = new JFrame("Black Jack");
//        frame.setLayout(null);
//        frame.setSize(600, 800);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
////        frame.add(panel);
//        frame.setVisible(true);

    }
}
