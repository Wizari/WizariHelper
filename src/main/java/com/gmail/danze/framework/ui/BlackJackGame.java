package com.gmail.danze.framework.ui;

import com.gmail.danze.framework.BlackJackHelper;
import com.gmail.danze.framework.game.Card;
import com.gmail.danze.framework.game.CardValue;
import com.gmail.danze.framework.game.Suit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackJackGame {
    public static void main(String[] args) {



        List<Integer> dealer = BlackJackHelper.dealer();

        int p1i;


        BlackJWindow gameWindow = new BlackJWindow("BlackJack");
        gameWindow.setVisible(true);

        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Suit.CLUBS, CardValue.ACE));
        cards.add(new Card(Suit.SPADES, CardValue.NINE));


        int score = 0;
        for (Card card : cards) {
            score += card.getValue().getScore();
        }
//        for (int i = 0; i < cards.size(); i++) {
//            Card card = cards.get(i);
//            score += card.getValue().getScore();
//        }

        gameWindow.updateCards(cards);
        gameWindow.updateScore(score);

        gameWindow.addHitListener(e -> {
            cards.add(new Card(Suit.SPADES, CardValue.NINE));
               int result = 0;
            for (Card card : cards) {
                result += card.getValue().getScore();
            }
            gameWindow.updateCards(cards);
            gameWindow.updateScore(result);
        });



        gameWindow.addStandListener(e -> {
            System.out.println("Нажата кнопка Stand");
        });



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


