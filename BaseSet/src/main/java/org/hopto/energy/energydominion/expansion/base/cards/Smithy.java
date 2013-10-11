package org.hopto.energy.energydominion.expansion.base.cards;

import org.hopto.energy.energydominion.api.CardType;
import org.hopto.energy.energydominion.api.Cost;
import org.hopto.energy.energydominion.api.bahaviour.Playable;
import org.hopto.energy.energydominion.api.core.DominionCard;

import java.util.ArrayList;

public class Smithy extends DominionCard{
//    private String name="Smithy";
//    private ArrayList<CardType> cardTypes=new ArrayList<>();
//    private String description="+3 Cards";
//    private Cost cost= new Cost(4);

    public Smithy() {

        super("Smithy", CardType.Action, new Cost(4), "+3 Cards");

    }


    @Override
    public void onPlay() {

    }
}
