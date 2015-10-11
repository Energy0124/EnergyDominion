package com.energy0124.energydominion.api;

import java.util.List;

public interface Deck extends Pile {

     Player getOwner();

     void setOwner(Player owner);

     boolean isEmpty();

     List<Card> getCards();

     void setCards(List<Card> cards);

     void shuffle();

     void addCard(Card card);

     void removeCard(Card card);

     Card getTopCard();

     Card drawTopCard();
}
