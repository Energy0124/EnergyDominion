package com.energy0124.energydominion.api;

import java.util.List;

public interface Hand {
    public Player getOwner();

    public void setOwner(Player owner);

    public List<Card> getCards();

    public void setCards(List<Card> cards);

    public void addCard(Card card);

    public void removeCard(Card card);

    public void discardHand();

    public Hand playCard(Card card);

    public void discardCard(Card card);
}
