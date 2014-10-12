package org.hopto.energy.energydominion.api;

import net.xeoh.plugins.base.Plugin;

import java.util.Set;

public interface Expansion extends Plugin {
    String getName();

    Set<Class<? extends Card>> getCardSet();

//     void addCard(Class<Card> card);
//
//    void removeCard(Class<Card> card);


//    List<Class> getClassList();
}
