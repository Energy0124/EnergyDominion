package com.energy0124.energydominion.api;

import com.energy0124.energydominion.api.event.PlayEvent;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    private Player owner;

    public Hand() {
        this(new ArrayList<Card>());
    }

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public List<Card> getCards() {
        return cards;

    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);

    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public void discardHand() {
        for (Card card : cards) {
            getOwner().getDiscardPile().addCard(card);
            removeCard(card);
        }

    }

    public Hand playCard(Card card) {

        if (!cards.contains(card)) {
            return this;
        }

        card.onPlay(new PlayEvent(card.getOwner()));
        discardCard(card);

        return this;
    }

    public void discardCard(Card card) {
        getOwner().getDiscardPile().addCard(card);
        removeCard(card);

    }
}
