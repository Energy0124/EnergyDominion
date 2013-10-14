package org.hopto.energy.energydominion.api;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this(new ArrayList<Card>());
    }

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;

    }

    public void addCard(Card card) {
        cards.add(card);

    }

    public void removeCard(Card card) {
        cards.remove(card);
    }
}
