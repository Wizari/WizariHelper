package com.gmail.danze.games.blackjack.model;

import com.gmail.danze.games.blackjack.utils.BlackJackHelper;

import java.util.Iterator;
import java.util.List;

public class Deck {

    private  List<Card> deck;
    private Iterator<Card> iterator;

    public Deck(List<Card> deck) {
        this.deck = deck;
        this.iterator = deck.iterator();
    }


    public Card getNextCard() {
        if (iterator.hasNext()){
            return iterator.next();
        } else {
            this.resetDeck();
            return iterator.next();
        }

    }

    private void resetDeck() {
        this.deck = BlackJackHelper.shuffleDeck(BlackJackHelper.createDeck(), 1000);
        this.iterator = deck.iterator();
    }




}
