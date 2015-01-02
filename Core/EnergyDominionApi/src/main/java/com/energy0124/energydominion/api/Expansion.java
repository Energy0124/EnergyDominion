package com.energy0124.energydominion.api;


import ro.fortsoft.pf4j.ExtensionPoint;

import java.util.Set;

public interface Expansion extends ExtensionPoint {
    String getName();

    Set<Class<? extends Card>> getCardSet();

//     void addCard(Class<Card> card);
//
//    void removeCard(Class<Card> card);


//    List<Class> getClassList();
}
