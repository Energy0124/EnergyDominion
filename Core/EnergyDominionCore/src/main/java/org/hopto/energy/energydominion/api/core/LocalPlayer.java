package org.hopto.energy.energydominion.api.core;

import org.hopto.energy.energydominion.api.Deck;
import org.hopto.energy.energydominion.api.Hand;


public class LocalPlayer implements org.hopto.energy.energydominion.api.Player {
    private Hand hand;
    private Deck deck;
    private String name;

    public LocalPlayer() {
        this("Player");
    }

    public LocalPlayer(String name) {
        this(name, new Hand(), new Deck());
    }

    public LocalPlayer(String name, Hand hand, Deck deck) {
        this.hand = hand;
        this.deck = deck;
        this.name = name;
    }

    @Override
    public Hand getHand() {

        return hand;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Deck getDeck() {
        return deck;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getName() {
        return name;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public void setDeck(Deck deck) {
        this.deck = deck;//To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setName(String name) {
        this.name = name;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void draw(int n) {
        for (int i = 1; i <= n; i++)
            getHand().addCard(getDeck().getTopCard());
    }
}
