package com.gmail.danze.framework.ui;

import com.gmail.danze.framework.game.Card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;


public class BlackJWindow extends JFrame {

    private  JPanel cardView;
    private JLabel score = new JLabel();
    private JButton hitButton = new JButton("Hit");
    private JButton standButton = new JButton("Stand");

    public BlackJWindow(String title) {
        super(title);
        this.setLayout(null);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(this.constructCardView(), BorderLayout.CENTER);
        this.add(this.constructResultView(), BorderLayout.NORTH);
        this.add(this.constructButtonPanel(), BorderLayout.SOUTH);
    }

    private Component constructButtonPanel() {
        JPanel panel = new JPanel();
        panel.add(hitButton);
        panel.add(standButton);
        return panel;
    }

    private Component constructResultView() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Score: "));
        panel.add(this.score);
        return panel;
    }

    private Component constructCardView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.cardView = panel;
        return this.cardView;
    }


    public void updateCards(List<Card> cardList) {
        this.cardView.removeAll();
        for (Card card : cardList) {
            String cardDescription = card.getSuit().name() + " : " + card.getValue().name();
            this.cardView.add(new JLabel(cardDescription));
        }
    }

    public void updateScore(int score) {
        this.score.setText(score + "");
    }

    public void addHitListener(ActionListener listener) {
        hitButton.addActionListener(listener);
    }

    public void addStandListener(ActionListener listener) {
        standButton.addActionListener(listener);
    }
}
