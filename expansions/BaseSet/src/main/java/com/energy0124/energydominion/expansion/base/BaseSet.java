package com.energy0124.energydominion.expansion.base;

import com.energy0124.energydominion.api.core.DominionExpansion;
import com.energy0124.energydominion.expansion.base.cards.Copper;
import com.energy0124.energydominion.expansion.base.cards.Estate;
import com.energy0124.energydominion.expansion.base.cards.Smithy;



public class BaseSet extends DominionExpansion {

 /*  static {
       registerCard(new Smithy());
   }*/

    public BaseSet() {
        // super();
        addCard(Smithy.class);
        addCard(Copper.class);
        addCard(Estate.class);

    }

  /*  @Deprecated
    public static void registerCard(Card card) {
        cardList.add(card);
    }*/

    /*    @Override
    public List<Class<Card>> getClassList() {
        return cardList;
    }*/

/*    @Override
    public void addCard(Card card) {
        cardList.add(card);

    }*/

    public static void main(String[] args) {

    }

}
