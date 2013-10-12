package org.hopto.energy.energydominion.expansion.base;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import org.hopto.energy.energydominion.api.Card;
import org.hopto.energy.energydominion.api.Expansion;
import org.hopto.energy.energydominion.expansion.base.cards.Smithy;

import java.util.ArrayList;
import java.util.List;


@PluginImplementation
public class BaseSet implements Expansion {
    private static String name = "BaseSet";
    private static List<Card> cardList = new ArrayList<Card>();
    private static List<Class> classList = new ArrayList<Class>();
 /*  static {
       registerCard(new Smithy());
   }*/

    public BaseSet() {
        registerCard(Smithy.class);

    }

    @Deprecated
    public static void registerCard(Card card) {
        cardList.add(card);
    }

    public static void registerCard(Class cardClass) {
        classList.add(cardClass);
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Card> getCardList() {
        return cardList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Class> getClassList() {
        return classList;
    }

    @Override
    public void addCard(Card card) {
        cardList.add(card);

    }

    @Override
    public void removeCard(Card card) {
        cardList.remove(card);

    }
}
