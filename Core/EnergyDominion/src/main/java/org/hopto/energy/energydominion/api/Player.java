package org.hopto.energy.energydominion.api;

public interface Player {
    Hand getHand();

    void setHand(Hand hand);

    Deck getDeck();

    void setDeck(Deck deck);

    String getName();

    void setName(String name);


}
