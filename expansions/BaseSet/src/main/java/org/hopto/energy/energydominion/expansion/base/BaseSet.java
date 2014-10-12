package org.hopto.energy.energydominion.expansion.base;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import org.hopto.energy.energydominion.api.core.DominionExpansion;
import org.hopto.energy.energydominion.expansion.base.cards.Copper;
import org.hopto.energy.energydominion.expansion.base.cards.Estate;
import org.hopto.energy.energydominion.expansion.base.cards.Smithy;


@PluginImplementation
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
