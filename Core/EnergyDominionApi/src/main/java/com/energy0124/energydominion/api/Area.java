package com.energy0124.energydominion.api;

import java.util.List;

/**
 * Created by Energy on 13年11月5日.
 */
public interface Area {
    List<Card> getCards();

    void setCards(List<Card> cards);

    void addCard(Card card);

    void removeCard(Card card);
}
