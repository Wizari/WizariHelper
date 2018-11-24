package com.gmail.danze.games.blackjack.utils;

import com.gmail.danze.games.blackjack.model.Card;
import com.gmail.danze.games.blackjack.model.CardValue;
import com.gmail.danze.games.blackjack.model.Suit;
import com.gmail.danze.trash.application.DanzeHelper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BlackJackHelper {

    /**
     *
     * @return
     */
    public static List<Integer> dealer() {
        List<Integer> aDeck = new ArrayList<>();
        int[] xdeckWeight = new int[]{
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
        while (aDeck.size() < 30) {
            int aRandom = DanzeHelper.generateRandom(0, 51);
            if (xdeckWeight[aRandom] != 0) {
                aDeck.add(aRandom);
                xdeckWeight[aRandom] = 0;
            }
        }
        return aDeck;
    }

    public static List<Card> createDeck() {
        List<Card> deck = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                deck.add(new Card(suit, cardValue));
            }
        }
        return deck;
    }


    public static List<Card> shuffleDeck(List<Card> deck, int count) {
        if (count < deck.size() * 2) {
            count = deck.size() * 2;
        }
        for (int i = 0; i < count; i++) {
            int i1 = DanzeHelper.generateRandom(0, deck.size() - 1);
            int i2 = DanzeHelper.generateRandom(0, deck.size() - 1);
            Card temp = deck.get(i1);
            deck.set(i1, deck.get(i2));
            deck.set(i2, temp);
        }
      return deck;
    }
}




//        List<String> deck = Arrays.asList(new String[]{
//                "Clubs 2", "Diamonds 2", "Hearts 2", "Spades 2",
//                "Clubs 3", "Diamonds 3", "Hearts 3", "Spades 3",
//                "Clubs 4", "Diamonds 4", "Hearts 4", "Spades 4",
//                "Clubs 5", "Diamonds 5", "Hearts 5", "Spades 5",
//                "Clubs 6", "Diamonds 6", "Hearts 6", "Spades 6",
//                "Clubs 7", "Diamonds 7", "Hearts 7", "Spades 7",
//                "Clubs 8", "Diamonds 8", "Hearts 8", "Spades 8",
//                "Clubs 9", "Diamonds 9", "Hearts 9", "Spades 9",
//                "Clubs 10", "Diamonds 10", "Hearts 10", "Spades 10",
//
//                "Clubs Jack", "Diamonds Jack", "Hearts Jack", "Spades Jack",
//                "Clubs Queen", "Diamonds Queen", "Hearts Queen", "Spades Queen",
//                "Clubs King", "Diamonds King", "Hearts King", "Spades King",
//                "Clubs Ace", "Diamonds Ace", "Hearts Ace", "Spades Ace",
//        });
//        int deckWeight[] = new int[]{
//                2, 2, 2, 2,
//                3, 3, 3, 3,
//                4, 4, 4, 4,
//                5, 5, 5, 5,
//                6, 6, 6, 6,
//                7, 7, 7, 7,
//                8, 8, 8, 8,
//                9, 9, 9, 9,
//                10, 10, 10, 10,
//
//                10, 10, 10, 10,
//                10, 10, 10, 10,
//                10, 10, 10, 10,
//                11, 11, 11, 11,
//        };
//        List<Integer> bDeck = new ArrayList<>();



//    public static List<Integer> adealer() {
//
//
//
//
//        return false;
//    }
