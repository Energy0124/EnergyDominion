package com.energy0124.energydominion.expansion.base.cards;

import com.energy0124.energydominion.api.CardType;
import com.energy0124.energydominion.api.Cost;
import com.energy0124.energydominion.api.bahaviour.Playable;
import com.energy0124.energydominion.api.core.DominionCard;
import com.energy0124.energydominion.api.event.PlayEvent;

/**
 * Created by Energy on 2/7/2014.
 */
public class Copper extends DominionCard implements Playable {
    public Copper() {

        super("Copper", CardType.Treasure, new Cost(0), "+1 Coin");

    }


    @Override
    public void onPlay(PlayEvent event) {
        super.onPlay(event);
        event.getTrigger().addCoin(1);
    }
}
