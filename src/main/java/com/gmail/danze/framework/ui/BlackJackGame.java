package com.gmail.danze.framework.ui;

import com.gmail.danze.framework.BlackJackHelper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackJackGame {
    public static void main(String[] args) {

        List<String> deck = Arrays.asList(new String[]{
                "Clubs 2", "Diamonds 2", "Hearts 2", "Spades 2",
                "Clubs 3", "Diamonds 3", "Hearts 3", "Spades 3",
                "Clubs 4", "Diamonds 4", "Hearts 4", "Spades 4",
                "Clubs 5", "Diamonds 5", "Hearts 5", "Spades 5",
                "Clubs 6", "Diamonds 6", "Hearts 6", "Spades 6",
                "Clubs 7", "Diamonds 7", "Hearts 7", "Spades 7",
                "Clubs 8", "Diamonds 8", "Hearts 8", "Spades 8",
                "Clubs 9", "Diamonds 9", "Hearts 9", "Spades 9",
                "Clubs 10", "Diamonds 10", "Hearts 10", "Spades 10",
                "Clubs Jack", "Diamonds Jack", "Hearts Jack", "Spades Jack",
                "Clubs Queen", "Diamonds Queen", "Hearts Queen", "Spades Queen",
                "Clubs King", "Diamonds King", "Hearts King", "Spades King",
                "Clubs Ace", "Diamonds Ace", "Hearts Ace", "Spades Ace",
        });
        int deckWeight[] = new int[]{
                2, 2, 2, 2,
                3, 3, 3, 3,
                4, 4, 4, 4,
                5, 5, 5, 5,
                6, 6, 6, 6,
                7, 7, 7, 7,
                8, 8, 8, 8,
                9, 9, 9, 9,
                10, 10, 10, 10,

                10, 10, 10, 10,
                10, 10, 10, 10,
                10, 10, 10, 10,
                11, 11, 11, 11,
        };

        List<Integer> dealer = BlackJackHelper.dealer();
        int p1summ = 0;
        p1summ = deckWeight[dealer.get(0)];
//        p1card = deck.get(dealer.get (0));

        int p1i;
        String p2card;
//        p2card = deckWeight[dealer.get()];


        JFrame frame = new JFrame("Black Jack");
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        frame.getContentPane().add(new JButton("Кнопка"), BorderLayout.NORTH);
//        frame.add(panel);
        JButton p1sum = new JButton("Вы набрали: " + p1summ);
        JButton newButton = new JButton();
        p1sum.setBounds(50, 50, 300, 50);
        p1sum.setLayout(null);
//        exitButton.setLayout(new FlowLayout());
        frame.getContentPane().add(p1sum);
        frame.setVisible(true);
//        exitButton.addActionListener(e -> {
//            frame.dispose();
//        });


        JButton p1deck = new JButton(deck.get(dealer.get (0)));
        p1deck.setBounds(50, 100, 300, 50);
        p1deck.setLayout(null);
        frame.getContentPane().add(p1deck);
//        frame.setVisible(true);
//        p1deck.addActionListener(e -> {
//            frame.dispose();
//        });

        JButton p2sum = new JButton(deck.get(dealer.get (0)));
        p2sum.setBounds(350, 50, 300, 50);
        p2sum.setLayout(null);
        frame.getContentPane().add(p2sum);
//        frame.setVisible(true);
//        p1deck.addActionListener(e -> {
//            frame.dispose();
//        });

        JButton p2deck = new JButton(deck.get(dealer.get (0)));
        p2deck.setBounds(350, 100, 300, 50);
        p2deck.setLayout(null);
        frame.getContentPane().add(p2deck);
//        frame.setVisible(true);
//        p2deck.addActionListener(e -> p1summ2+1);




//        List<Integer> dealer = BlackJackHelper.dealer();


    }

    //        System.out.println(p1s);
//        System.out.println(p1i);
//        System.out.println(dealer);
//        JButton exitButton = new JButton("EXIT");
//        exitButton.setBounds(50, 50, 200, 70);
//        GameAreaPanel panel = new GameAreaPanel(12, 22);
//        panel.setBounds(100, 50, panel.WIDTH * panel.POINT_SIZE, panel.HEIGHT * panel.POINT_SIZE);
//        panel.updateGameArea(gameArea);
//        JPanel panel = new JPanel();
//        panel.setLayout(null);
//        panel.add(exitButton);
//        JFrame frame = new JFrame("TETRIS");
//        frame.setLayout(null);
//        frame.setSize(600, 800);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.add(panel);
//        frame.setVisible(true);
//        exitButton.addActionListener(e -> {
//            frame.dispose();
//        });
//        JButton exitButton = new JButton("EXIT");
//        exitButton.setBounds(50, 50, 200, 70);
////        getContentPane().add(exitButton);
//        JPanel panel = new JPanel();
//        panel.setLayout();
//        panel.add(exitButton);
//        JFrame myWindow = new BlackJWindow();
//        myWindow.setVisible(true);
//        JButton exitButton = new JButton("EXIT");
//        JButton newButton = new JButton();
//        exitButton.setBounds(50, 50, 200, 70);
//        panel.setLayout();
//        getContentPane(myWindow).add(exitButton);
//        frame.getContentPane().add(new JButton("Кнопка"), BorderLayout.NORTH);
//        JButton newButton = new JButton();
//        getContentPane().add(newButton);

}


