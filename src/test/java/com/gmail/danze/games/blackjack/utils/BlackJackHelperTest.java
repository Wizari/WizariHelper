package com.gmail.danze.games.blackjack.utils;

import com.gmail.danze.games.blackjack.model.Card;
import com.gmail.danze.trash.application.DanzeHelper;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BlackJackHelperTest {

    @Test
    public void dealer() {

        List<Integer> dealer = BlackJackHelper.dealer();
        System.out.println();
    }

    @Test
    public void createDeckTest() {
        List<Card> deck = BlackJackHelper.createDeck();
        assertEquals(52, deck.size());
    }

    @Test
    public void shuffleDeck() {
        List<Card> deck = BlackJackHelper.createDeck();
        long start = System.currentTimeMillis();
        List<Card> cards = BlackJackHelper.shuffleDeck(deck, 1000);
        long finish = System.currentTimeMillis();
        assertEquals(deck.size(), cards.size());
        System.out.println("Deck was shuffle: " + (finish - start) + " ms." );
    }
}