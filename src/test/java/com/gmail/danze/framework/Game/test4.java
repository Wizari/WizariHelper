package com.gmail.danze.framework.Game;

import com.gmail.danze.games.blackjack.model.Card;
import com.gmail.danze.games.blackjack.model.CardValue;
import com.gmail.danze.games.blackjack.model.Suit;

import java.util.ArrayList;
import java.util.List;

public class test4 {
    public static void main(String[] args) {

        List<Card> deck = new ArrayList<>();
        deck.add(new Card(Suit.CLUBS, CardValue.TWO));
        deck.add(new Card(Suit.CLUBS, CardValue.THREE));
        deck.add(new Card(Suit.CLUBS, CardValue.FOUR));
        deck.add(new Card(Suit.CLUBS, CardValue.FIVE));
        deck.add(new Card(Suit.CLUBS, CardValue.SIX));
        deck.add(new Card(Suit.CLUBS, CardValue.SEVEN));
        deck.add(new Card(Suit.CLUBS, CardValue.EIGHT));
        deck.add(new Card(Suit.CLUBS, CardValue.NINE));
        deck.add(new Card(Suit.CLUBS, CardValue.TEN));
        deck.add(new Card(Suit.CLUBS, CardValue.JACK));
        deck.add(new Card(Suit.CLUBS, CardValue.QUEEN));
        deck.add(new Card(Suit.CLUBS, CardValue.KING));
        deck.add(new Card(Suit.CLUBS, CardValue.ACE));

        deck.add(new Card(Suit.DIAMONDS, CardValue.TWO));
        deck.add(new Card(Suit.DIAMONDS, CardValue.THREE));
        deck.add(new Card(Suit.DIAMONDS, CardValue.FOUR));
        deck.add(new Card(Suit.DIAMONDS, CardValue.FIVE));
        deck.add(new Card(Suit.DIAMONDS, CardValue.SIX));
        deck.add(new Card(Suit.DIAMONDS, CardValue.SEVEN));
        deck.add(new Card(Suit.DIAMONDS, CardValue.EIGHT));
        deck.add(new Card(Suit.DIAMONDS, CardValue.NINE));
        deck.add(new Card(Suit.DIAMONDS, CardValue.TEN));
        deck.add(new Card(Suit.DIAMONDS, CardValue.JACK));
        deck.add(new Card(Suit.DIAMONDS, CardValue.QUEEN));
        deck.add(new Card(Suit.DIAMONDS, CardValue.KING));
        deck.add(new Card(Suit.DIAMONDS, CardValue.ACE));

        deck.add(new Card(Suit.HEARTS, CardValue.TWO));
        deck.add(new Card(Suit.HEARTS, CardValue.THREE));
        deck.add(new Card(Suit.HEARTS, CardValue.FOUR));
        deck.add(new Card(Suit.HEARTS, CardValue.FIVE));
        deck.add(new Card(Suit.HEARTS, CardValue.SIX));
        deck.add(new Card(Suit.HEARTS, CardValue.SEVEN));
        deck.add(new Card(Suit.HEARTS, CardValue.EIGHT));
        deck.add(new Card(Suit.HEARTS, CardValue.NINE));
        deck.add(new Card(Suit.HEARTS, CardValue.TEN));
        deck.add(new Card(Suit.HEARTS, CardValue.JACK));
        deck.add(new Card(Suit.HEARTS, CardValue.QUEEN));
        deck.add(new Card(Suit.HEARTS, CardValue.KING));
        deck.add(new Card(Suit.HEARTS, CardValue.ACE));

        deck.add(new Card(Suit.SPADES, CardValue.TWO));
        deck.add(new Card(Suit.SPADES, CardValue.THREE));
        deck.add(new Card(Suit.SPADES, CardValue.FOUR));
        deck.add(new Card(Suit.SPADES, CardValue.FIVE));
        deck.add(new Card(Suit.SPADES, CardValue.SIX));
        deck.add(new Card(Suit.SPADES, CardValue.SEVEN));
        deck.add(new Card(Suit.SPADES, CardValue.EIGHT));
        deck.add(new Card(Suit.SPADES, CardValue.NINE));
        deck.add(new Card(Suit.SPADES, CardValue.TEN));
        deck.add(new Card(Suit.SPADES, CardValue.JACK));
        deck.add(new Card(Suit.SPADES, CardValue.QUEEN));
        deck.add(new Card(Suit.SPADES, CardValue.KING));
        deck.add(new Card(Suit.SPADES, CardValue.ACE));
    }
}