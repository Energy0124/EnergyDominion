package org.hopto.energy.energydominion.api;

import net.xeoh.plugins.base.Plugin;

import java.util.List;

public interface Expansion extends Plugin {
    String getName();

    List<Card> getCardList();

    void addCard(Card card);

    void removeCard(Card card);


    List<Class> getClassList();
}
