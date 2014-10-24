package com.energy0124.energydominion.api.game;

import com.energy0124.energydominion.api.Card;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Energy on 6/7/2014.
 */
public class CardManager {

    private Set<Class<? extends Card>> cardSet = new HashSet<>();

    public CardManager() {
    }

    public void registerCard(Class<? extends Card> card) {
        cardSet.add(card);
    }

    public void registerCards(Set<Class<? extends Card>> cards) {
        cardSet.addAll(cards);

    }

    public Set<Class<? extends Card>> getCardSet() {
        return cardSet;
    }

    public void setCardSet(Set<Class<? extends Card>> cardSet) {
        this.cardSet = cardSet;
    }
}
