package com.gmail.danze.games.blackjack;

import com.gmail.danze.games.blackjack.logic.BlackJackLogic;
import com.gmail.danze.games.blackjack.model.Deck;
import com.gmail.danze.games.blackjack.utils.BlackJackHelper;
import com.gmail.danze.games.blackjack.view.BlackJWindow;

public class BlackJackGame {
    public static void main(String[] args) {

        BlackJWindow gameWindow = new BlackJWindow("BlackJack");

        Deck deck = new Deck(BlackJackHelper.shuffleDeck(BlackJackHelper.createDeck(), 1000));

        BlackJackLogic logic = new BlackJackLogic(deck, gameWindow);

        gameWindow.setVisible(true);
        logic.start();
    }
}

////        int [] xDeal = xdealer.stream().mapToInt(i->i).toArray();
//        List<Card> cards = new ArrayList<>();
//        List<Card> dealCards = new ArrayList<>();
//
////        cards.add(deck.get(BlackJackHelper.dealer().get(0)));
//        dealCards.add(deck.get(xdealer.get(2)));
//        cards.add(deck.get(xdealer.get(0)));
//        cards.add(deck.get(xdealer.get(1)));
////        cards.add(deck(xDeal[0]));
//        int score = 0;
//        for (Card card : cards) {
//            score += card.getValue().getScore();
//        }
//        int dealerScore = 0;
//        for (Card card : dealCards) {
//            dealerScore += card.getValue().getScore();
//        }
////        for (int i = 0; i < cards.size(); i++) {
////            Card card = cards.get(i);
////            score += card.getValue().getScore();
////        }
//        gameWindow.updateDealerCards(dealCards);
//        gameWindow.updateDealerScore(dealerScore);
//        gameWindow.updatePlayerCards(cards);
//        gameWindow.updatePlayerScore(score);
//        AtomicInteger x = new AtomicInteger(3);
//        gameWindow.addHitListener(e -> {
//            x.getAndIncrement();
////            cards.add(new Card(Suit.SPADES, CardValue.NINE));
//            cards.add(deck.get(xdealer.get(x.get())));
//            int result = 0;
//            int dresult = 0;
//
//            for (Card card : cards) {
//                result += card.getValue().getScore();
//                if (result == 21){
//
//                    if (dresult != 21) {
//
//                    }
//                    System.out.println("21!");
//                }
//                if (result > 21) {
//                    System.out.println("Game over!");
//
//                }
//            }
//            gameWindow.updatePlayerCards(cards);
//            gameWindow.updatePlayerScore(result);
//        });
//
//
//
//        gameWindow.addStandListener(e -> {
//
//
//            System.out.println("Нажата кнопка Stand");
//        });
//
//
//    }
//
//
////    List<Integer> dealer = BlackJackHelper.dealer();
////
////    int p1i;
////
////
////    BlackJWindow gameWindow = new BlackJWindow("BlackJack");
////        gameWindow.setVisible(true);
////
//////        List<Card> cards = new ArrayList<>();
////////        cards.add(new Card(Suit.CLUBS, CardValue.ACE));
////////        cards.add(new Card(Suit.SPADES, CardValue.NINE));
////
////    List<Card> cards = new ArrayList<>();
////        cards.add(new Card(Suit.CLUBS, CardValue.TWO));
////        cards.add(new Card(Suit.CLUBS, CardValue.THREE));
////        cards.add(new Card(Suit.CLUBS, CardValue.FOUR));
////        cards.add(new Card(Suit.CLUBS, CardValue.FIVE));
////        cards.add(new Card(Suit.CLUBS, CardValue.SIX));
////        cards.add(new Card(Suit.CLUBS, CardValue.SEVEN));
////        cards.add(new Card(Suit.CLUBS, CardValue.EIGHT));
////        cards.add(new Card(Suit.CLUBS, CardValue.NINE));
////        cards.add(new Card(Suit.CLUBS, CardValue.TEN));
////        cards.add(new Card(Suit.CLUBS, CardValue.JACK));
////        cards.add(new Card(Suit.CLUBS, CardValue.QUEEN));
////        cards.add(new Card(Suit.CLUBS, CardValue.KING));
////        cards.add(new Card(Suit.CLUBS, CardValue.ACE));
////
////        cards.add(new Card(Suit.DIAMONDS, CardValue.TWO));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.THREE));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.FOUR));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.FIVE));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.SIX));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.SEVEN));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.EIGHT));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.NINE));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.TEN));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.JACK));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.QUEEN));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.KING));
////        cards.add(new Card(Suit.DIAMONDS, CardValue.ACE));
////
////        cards.add(new Card(Suit.HEARTS, CardValue.TWO));
////        cards.add(new Card(Suit.HEARTS, CardValue.THREE));
////        cards.add(new Card(Suit.HEARTS, CardValue.FOUR));
////        cards.add(new Card(Suit.HEARTS, CardValue.FIVE));
////        cards.add(new Card(Suit.HEARTS, CardValue.SIX));
////        cards.add(new Card(Suit.HEARTS, CardValue.SEVEN));
////        cards.add(new Card(Suit.HEARTS, CardValue.EIGHT));
////        cards.add(new Card(Suit.HEARTS, CardValue.NINE));
////        cards.add(new Card(Suit.HEARTS, CardValue.TEN));
////        cards.add(new Card(Suit.HEARTS, CardValue.JACK));
////        cards.add(new Card(Suit.HEARTS, CardValue.QUEEN));
////        cards.add(new Card(Suit.HEARTS, CardValue.KING));
////        cards.add(new Card(Suit.HEARTS, CardValue.ACE));
////
////        cards.add(new Card(Suit.SPADES, CardValue.TWO));
////        cards.add(new Card(Suit.SPADES, CardValue.THREE));
////        cards.add(new Card(Suit.SPADES, CardValue.FOUR));
////        cards.add(new Card(Suit.SPADES, CardValue.FIVE));
////        cards.add(new Card(Suit.SPADES, CardValue.SIX));
////        cards.add(new Card(Suit.SPADES, CardValue.SEVEN));
////        cards.add(new Card(Suit.SPADES, CardValue.EIGHT));
////        cards.add(new Card(Suit.SPADES, CardValue.NINE));
////        cards.add(new Card(Suit.SPADES, CardValue.TEN));
////        cards.add(new Card(Suit.SPADES, CardValue.JACK));
////        cards.add(new Card(Suit.SPADES, CardValue.QUEEN));
////        cards.add(new Card(Suit.SPADES, CardValue.KING));
////        cards.add(new Card(Suit.SPADES, CardValue.ACE));
////
//
//    int score = 0;
//        for (Card card : cards) {
//        score += card.getValue().getScore();
//    }
////        for (int i = 0; i < cards.size(); i++) {
////            Card card = cards.get(i);
////            score += card.getValue().getScore();
////        }
//
//        gameWindow.updatePlayerCards(cards);
//        gameWindow.updatePlayerScore(score);
//
//        gameWindow.addHitListener(e -> {
//        cards.add(new Card(Suit.SPADES, CardValue.NINE));
//        int result = 0;
//        for (Card card : cards) {
//            result += card.getValue().getScore();
//        }
//        gameWindow.updatePlayerCards(cards);
//        gameWindow.updatePlayerScore(result);
//    });
//
//
//
//        gameWindow.addStandListener(e -> {
//        System.out.println("Нажата кнопка Stand");
//    });
//
//
//
//}


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

//


