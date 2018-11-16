package com.gmail.danze.framework.ui;

import com.gmail.danze.framework.DanzeHelper;
import com.gmail.danze.framework.GameHelper;
import sun.security.krb5.internal.PAData;

import javax.swing.*;

public class RandomApplication {
    public static void main(String[] args) {
        JButton generateRandomButton = new JButton("Generate Random");
        generateRandomButton.setBounds(50, 50, 200, 40);

        JTextField minTextField = new JTextField();
        minTextField.setBounds(50, 100, 200, 40);

        JTextField maxTextField = new JTextField();
        maxTextField.setBounds(50, 150, 200, 40);
        JLabel result = new JLabel();
        result.setBounds(50, 200, 200, 40);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(generateRandomButton);
        panel.add(minTextField);
        panel.add(maxTextField);
        panel.add(result);


        JFrame frame = new JFrame("Random");
        frame.setSize(640,460);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        generateRandomButton.addActionListener(e -> {
            String maxText = maxTextField.getText();
            String minText = minTextField.getText();
            try {
                int max = Integer.parseInt(maxText);
                int min = Integer.parseInt(minText);
                int random = DanzeHelper.generateRandom(min, max);
                result.setText(String.valueOf(random));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(frame,
                        "Не получилось преобразовать в число",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

    }
}
