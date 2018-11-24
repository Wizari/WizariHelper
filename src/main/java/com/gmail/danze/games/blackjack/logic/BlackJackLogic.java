package com.gmail.danze.games.blackjack.logic;

import com.gmail.danze.games.blackjack.model.Card;
import com.gmail.danze.games.blackjack.model.Deck;
import com.gmail.danze.games.blackjack.view.BlackJWindow;

import java.util.ArrayList;
import java.util.List;

public class BlackJackLogic {

    private Deck deck;
    private BlackJWindow window;
    private int playerSum;
    private int dealerSum;


    List<Card> playerCards = new ArrayList<>();
    List<Card> dealerCards = new ArrayList<>();

    public BlackJackLogic(Deck deck, BlackJWindow window) {
        this.deck = deck;
        this.window = window;
    }

    public void start() {
        addPlayerCard();
        addPlayerCard();
        addDealerCard();
    }

    public void addPlayerCard() {
        playerCards.add(deck.getNextCard());
        window.updatePlayerCards(this.playerCards);
        this.playerSum = playerCards.stream().mapToInt(card -> card.getValue().getScore()).sum();
        window.updatePlayerScore(this.playerSum);
    }

    public void addDealerCard() {
        dealerCards.add(deck.getNextCard());
        window.updateDealerCards(this.dealerCards);
        this.dealerSum = dealerCards.stream().mapToInt(card -> card.getValue().getScore()).sum();
        window.updateDealerScore(this.dealerSum);
    }
}
