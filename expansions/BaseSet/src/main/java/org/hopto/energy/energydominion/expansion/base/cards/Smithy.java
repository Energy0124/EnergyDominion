package org.hopto.energy.energydominion.expansion.base.cards;

import org.hopto.energy.energydominion.api.CardType;
import org.hopto.energy.energydominion.api.Cost;
import org.hopto.energy.energydominion.api.bahaviour.Playable;
import org.hopto.energy.energydominion.api.core.DominionCard;
import org.hopto.energy.energydominion.api.event.PlayEvent;

public class Smithy extends DominionCard implements Playable {
//    private String name="Smithy";
//    private ArrayList<CardType> cardTypes=new ArrayList<>();
//    private String description="+3 Cards";
//    private Cost cost= new Cost(4);

    public Smithy() {

        super("Smithy", CardType.Action, new Cost(4), "+3 Cards");

    }


    @Override
    public void onPlay(PlayEvent event) {
        super.onPlay(event);
        event.getTrigger().drawCardFromDeck(3);
    }
}
