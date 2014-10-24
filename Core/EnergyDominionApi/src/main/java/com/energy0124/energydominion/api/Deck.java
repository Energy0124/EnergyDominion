package com.energy0124.energydominion.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements Pile {
    private Player owner;
    private List<Card> cards;

    public Deck() {
        this(new ArrayList<Card>());
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    @Override
    public List<Card> getCards() {
        return cards;

    }

    @Override
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);

    }

    @Override
    public void addCard(Card card) {
        cards.add(card);

    }

    @Override
    public void removeCard(Card card) {
        cards.remove(card);
    }

    public Card getTopCard() {
        return cards.get(0);
    }

    public Card drawTopCard() {
        //TODO:handle exceptions
        return cards.remove(0);
    }
}
