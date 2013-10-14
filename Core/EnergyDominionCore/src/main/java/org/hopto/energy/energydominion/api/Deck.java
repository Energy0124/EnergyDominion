package org.hopto.energy.energydominion.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this(new ArrayList<Card>());
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;

    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);

    }

    public void addCard(Card card) {
        cards.add(card);

    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public Card getTopCard() {
        return cards.get(0);
    }
}
