package com.gmail.danze.trash;

import javax.swing.*;

public class TestApplication {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon(TestApplication.class.getResource("/16070.png"));

        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0,0,25, 25);

        JPanel panel = new JPanel(null);
        panel.add(imageLabel);
        JFrame frame = new JFrame("Test");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
