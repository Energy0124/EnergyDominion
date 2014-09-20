package org.hopto.energy.energydominion.expansion.base.cards;

import org.hopto.energy.energydominion.api.CardType;
import org.hopto.energy.energydominion.api.Cost;
import org.hopto.energy.energydominion.api.bahaviour.Playable;
import org.hopto.energy.energydominion.api.core.DominionCard;
import org.hopto.energy.energydominion.api.event.PlayEvent;

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
