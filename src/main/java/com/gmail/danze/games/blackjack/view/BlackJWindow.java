package com.gmail.danze.games.blackjack.view;

import com.gmail.danze.games.blackjack.model.Card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;


public class BlackJWindow extends JFrame {

    private JPanel cardPlayerView;
    private JPanel cardDealerView;
    private JLabel playerScore = new JLabel();
    private JLabel dealerScore = new JLabel();
    private JButton hitButton = new JButton("Hit");
    private JButton standButton = new JButton("Stand");

    public BlackJWindow(String title) {
        super(title);
        this.setLayout(null);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(this.constructPlayerCardView(), BorderLayout.WEST);
        this.add(this.constructDealerCardView(), BorderLayout.EAST);
        this.add(this.constructResultView(), BorderLayout.CENTER);
        this.add(this.constructButtonPanel(), BorderLayout.SOUTH);
    }

    private Component constructDealerCardView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.cardDealerView = panel;
        return this.cardDealerView;
    }

    private Component constructButtonPanel() {
        JPanel panel = new JPanel();
        panel.add(hitButton);
        panel.add(standButton);
        return panel;
    }

    private Component constructResultView() {
        JPanel playerScore = new JPanel();
        playerScore.add(new JLabel("Score: "));
        playerScore.add(this.playerScore);

        JPanel dealerScore = new JPanel();
        dealerScore.add(new JLabel("Score: "));
        dealerScore.add(this.dealerScore);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(playerScore, BorderLayout.WEST);
        centerPanel.add(dealerScore, BorderLayout.EAST);
        return centerPanel;
    }

    private Component constructPlayerCardView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.cardPlayerView = panel;
        return this.cardPlayerView;
    }

    public Component selectImage(Card card) {
        JPanel panel = new JPanel();

        ImageIcon imageIcon = null;
        switch (card.getSuit()) {
            case CLUBS:
                imageIcon = new ImageIcon(this.getClass().getResource("/1.png"));
                break;
            case HEARTS:
                imageIcon = new ImageIcon(this.getClass().getResource("/4.png"));
                break;
            case SPADES:
                imageIcon = new ImageIcon(this.getClass().getResource("/3.png"));
                break;
            case DIAMONDS:
                imageIcon = new ImageIcon(this.getClass().getResource("/2.png"));
                break;
        }
        String value = null;
        switch (card.getValue()) {
            case TWO:
                value = "2";
                break;
            case THREE:
                value = "3";
                break;
            case FOUR:
                value = "4";
                break;
            case FIVE:
                value = "5";
                break;
            case SIX:
                value = "6";
                break;
            case SEVEN:
                value = "7";
                break;
            case EIGHT:
                value = "8";
                break;
            case NINE:
                value = "9";
                break;
            case TEN:
                value = "10";
                break;
            case JACK:
                value = "J";
                break;
            case QUEEN:
                value = "Q";
                break;
            case KING:
                value = "K";
                break;
            case ACE:
                value = "A";
            break;

        }



        JLabel suitLabel = new JLabel(imageIcon);
        suitLabel.setBounds(10, 10, 25, 25);
        panel.add(suitLabel);
        JLabel valueLabel = new JLabel(value);
        valueLabel.setBounds(35, 10, 25, 25);
        panel.add(valueLabel);
        return panel;

    }

    public void updatePlayerCards(List<Card> cardList) {
        this.cardPlayerView.removeAll();
        for (Card card : cardList) {

            this.cardPlayerView.add(this.selectImage(card));
        }
    }

    public void updateDealerCards(List<Card> cardList) {
        this.cardDealerView.removeAll();
        for (Card card : cardList) {

            this.cardDealerView.add(this.selectImage(card));
        }
    }

    public void updatePlayerScore(int score) {
        this.playerScore.setText(score + "");
    }

    public void updateDealerScore(int score) {
        this.dealerScore.setText(score + "");
    }

    public void addHitListener(ActionListener listener) {
        hitButton.addActionListener(listener);
    }

    public void addStandListener(ActionListener listener) {
        standButton.addActionListener(listener);
    }

}

//    private  JPanel cardPlayerView;
//    private  JPanel dealerCardView;
//    private JLabel playerScore = new JLabel();
//    private JLabel dealerScore = new JLabel();
//    private JButton hitButton = new JButton("Hit");
//    private JButton standButton = new JButton("Stand");
//
//    public BlackJWindow(String title) {
//        super(title);
//        this.setLayout(null);
//        this.setSize(800, 800);
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.setLayout(new BorderLayout());
//        this.add(this.constructCardView(), BorderLayout.CENTER);
//        //        this.add(this.constructResultView(), BorderLayout.NORTH);
//        this.add(this.constructResultView(), BorderLayout.BEFORE_LINE_BEGINS);
//        this.add(this.constructButtonPanel(), BorderLayout.SOUTH);
//
//        this.add(this.constructDealerResultView(), BorderLayout.BEFORE_FIRST_LINE); //////
//        this.add(this.constructDealerCardView(), BorderLayout.CENTER);//////////
//    }
//
//    private Component constructButtonPanel() {
//        JPanel panel = new JPanel();
//        panel.add(hitButton);
//        panel.add(standButton);
//        return panel;
//    }
//
//    private Component constructResultView() {
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Score: "));
//        panel.add(this.playerScore);
//        return panel;
//    }
//
//    private Component constructCardView() {
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        this.cardPlayerView = panel;
//        return this.cardPlayerView;
//    }
//
//    public void updatePlayerCards(List<Card> cardList) {
//        this.cardPlayerView.removeAll();
//        for (Card card : cardList) {
//            String cardDescription = card.getSuit().name() + " : " + card.getValue().name();
//            this.cardPlayerView.add(new JLabel(cardDescription));
//        }
//    }
//
//    public void updatePlayerScore(int playerScore) {
//        this.playerScore.setText(playerScore + "");
//    }
//
//    public void addHitListener(ActionListener listener) {
//        hitButton.addActionListener(listener);
//    }
//
//    public void addStandListener(ActionListener listener) {
//        standButton.addActionListener(listener);
//    }
//
//
//
//
//    private Component constructDealerResultView() {  //////
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Score: "));
//        panel.add(this.dealerScore);
//        return panel;
//    }
//
//    private Component constructDealerCardView() {        /////////////
//        JPanel dpanel = new JPanel();
//        dpanel.setLayout(new BoxLayout(dpanel, BoxLayout.Y_AXIS));
//        this.dealerCardView = dpanel;
//        return this.dealerCardView;
//    }
//
//    public void updateDealerCards(List<Card> cardList) {          ////////////
//        this.dealerCardView.removeAll();
//        for (Card card : cardList) {
//            String dealerCardDescription = card.getSuit().name() + " : " + card.getValue().name();
//            this.dealerCardView.add(new JLabel(dealerCardDescription));
//        }
//    }
//
//    public void updateDealerScore(int playerScore) { this.dealerScore.setText(playerScore + "");
//    } //////////
//}




//    private  JPanel cardPlayerView;
//    private JLabel playerScore = new JLabel();
//    private JButton hitButton = new JButton("Hit");
//    private JButton standButton = new JButton("Stand");
//
//    public BlackJWindow(String title) {
//        super(title);
//        this.setLayout(null);
//        this.setSize(800, 800);
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.setLayout(new BorderLayout());
//        this.add(this.constructCardView(), BorderLayout.CENTER);
//        this.add(this.constructResultView(), BorderLayout.NORTH);
//        this.add(this.constructButtonPanel(), BorderLayout.SOUTH);
//    }
//
//    private Component constructButtonPanel() {
//        JPanel panel = new JPanel();
//        panel.add(hitButton);
//        panel.add(standButton);
//        return panel;
//    }
//
//    private Component constructResultView() {
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Score: "));
//        panel.add(this.playerScore);
//        return panel;
//    }
//
//    private Component constructCardView() {
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        this.cardPlayerView = panel;
//        return this.cardPlayerView;
//    }
//
//
//    public void updatePlayerCards(List<Card> cardList) {
//        this.cardPlayerView.removeAll();
//        for (Card card : cardList) {
//            String cardDescription = card.getSuit().name() + " : " + card.getValue().name();
//            this.cardPlayerView.add(new JLabel(cardDescription));
//        }
//    }
//
//    public void updatePlayerScore(int playerScore) {
//        this.playerScore.setText(playerScore + "");
//    }
//
//    public void addHitListener(ActionListener listener) {
//        hitButton.addActionListener(listener);
//    }
//
//    public void addStandListener(ActionListener listener) {
//        standButton.addActionListener(listener);
//    }
//}
