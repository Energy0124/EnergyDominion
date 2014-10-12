package org.hopto.energy.energydominion.api.core;

import org.hopto.energy.energydominion.api.Card;
import org.hopto.energy.energydominion.api.Expansion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Energy on 7/7/2014.
 */
public abstract class DominionExpansion implements Expansion {
    //private static String name = "BaseSet";
    //private static List<Card> cardSet = new ArrayList<Card>();
    private Set<Class<? extends Card>> cardSet = new HashSet<>();


    public DominionExpansion() {
       /* Reflections reflections = new Reflections(this.getClass().getPackage().getName()+".cards");
        cardSet = reflections.getSubTypesOf(Card.class);*/


    }


    public void addCard(Class<? extends Card> cardClass) {
        cardSet.add(cardClass);
    }

    public void removeCard(Class<? extends Card> card) {
        cardSet.remove(card);

    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Set<Class<? extends Card>> getCardSet() {
        return cardSet;
    }

 /*   public static void setCardSet(Set<Class<? extends Card>> cardSet) {
        DominionExpansion.cardSet = cardSet;
    }*/
}
