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

        this.cardDealerView = this.constructDealerCardView();
        this.cardPlayerView = this.constructPlayerCardView();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.add(this.cardPlayerView);
        contentPanel.add(this.cardDealerView);

        this.setLayout(null);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(contentPanel);


//        this.add(this.constructResultView(), BorderLayout.CENTER);  <<--- Сам
//        this.add(this.constructButtonPanel(), BorderLayout.SOUTH);  <<--- Сам
    }

    private JPanel constructDealerCardView() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(600, 10, 200, 800);
        return panel;
    }

    private JPanel constructPlayerCardView() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 10, 200, 800);
        return panel;
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



    public Component selectImage(Card card, int index) {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        int height = 30;
        panel.setBounds(0, index * height, 200, height);

        ImageIcon imageIcon = null;
        switch (card.getSuit()) {
            case CLUBS:
                imageIcon = new ImageIcon(this.getClass().getResource("/16070.png"));
                break;
            case HEARTS:
                imageIcon = new ImageIcon(this.getClass().getResource("/46070.png"));
                break;
            case SPADES:
                imageIcon = new ImageIcon(this.getClass().getResource("/36070.png"));
                break;
            case DIAMONDS:
                imageIcon = new ImageIcon(this.getClass().getResource("/26070.png"));
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
        JLabel suitLabel = new JLabel(value, imageIcon, SwingConstants.CENTER);
        suitLabel.setBounds(0, 0, 100, 25);
        suitLabel.setFont(new Font(suitLabel.getFont().getName(), Font.BOLD, 25));
        panel.add(suitLabel);
//        JLabel valueLabel = new JLabel(value);

    //    valueLabel.setBounds(30, 0, 25, 25);
  //      panel.add(valueLabel);
        return panel;
    }

    public void updatePlayerCards(List<Card> cardList) {
        this.cardPlayerView.removeAll();

        for (int i = 0; i < cardList.size(); i++) {
            this.cardPlayerView.add(this.selectImage(cardList.get(i), i));
        }
        this.repaint();

    }

    public void updateDealerCards(List<Card> cardList) {
        this.cardDealerView.removeAll();

        for (int i = 0; i < cardList.size(); i++) {
            this.cardDealerView.add(this.selectImage(cardList.get(i), i));
        }
        this.repaint();
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
