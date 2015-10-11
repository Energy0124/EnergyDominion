package com.energy0124.energydominion.expansion.base.cards;

import com.energy0124.energydominion.api.CardType;
import com.energy0124.energydominion.api.DominionCard;
import com.energy0124.energydominion.api.bahaviour.Playable;
import com.energy0124.energydominion.api.event.PlayEvent;
import com.energy0124.energydominion.core.DominionGameManager;

public class Smithy extends DominionCard implements Playable {
//    private String name="Smithy";
//    private ArrayList<CardType> cardTypes=new ArrayList<>();
//    private String description="+3 Cards";
//    private Cost cost= new Cost(4);

    public Smithy() {

        super("Smithy", CardType.Action, DominionGameManager.getCostFactory().createCost().setTreasureCost(4).getCost(), "+3 Cards");

    }


    @Override
    public void onPlay(PlayEvent event) {
        super.onPlay(event);
        event.getTrigger().drawCardFromDeck(3);
    }
}
