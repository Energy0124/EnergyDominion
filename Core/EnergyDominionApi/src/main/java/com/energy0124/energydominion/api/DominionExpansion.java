package com.energy0124.energydominion.api;

import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Energy on 7/7/2014.
 */

public abstract class DominionExpansion extends Plugin implements Expansion {
    //private static String name = "BaseSet";
    //private static List<Card> cardClassSet = new ArrayList<Card>();
    private static Set<Class<? extends Card>> cardClassSet = new HashSet<>();

    /**
     * Constructor to be used by plugin manager for plugin instantiation.
     * Your plugins have to provide constructor with this exact signature to
     * be successfully loaded by manager.
     *
     * @param wrapper
     */
    public DominionExpansion(PluginWrapper wrapper) {
        super(wrapper);
    }


    //public DominionExpansion() {
       /* Reflections reflections = new Reflections(this.getClass().getPackage().getName()+".cards");
        cardClassSet = reflections.getSubTypesOf(Card.class);*/


    //}


    public static void addCardClass(Class<? extends Card> cardClass) {
        cardClassSet.add(cardClass);
    }

    public static void removeCardClass(Class<? extends Card> card) {
        cardClassSet.remove(card);

    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Set<Class<? extends Card>> getCardClassSet() {
        return cardClassSet;
    }

 /*   public static void setCardSet(Set<Class<? extends Card>> cardClassSet) {
        DominionExpansion.cardClassSet = cardClassSet;
    }*/
}
