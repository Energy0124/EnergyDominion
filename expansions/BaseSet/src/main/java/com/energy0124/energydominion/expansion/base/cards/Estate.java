package com.energy0124.energydominion.expansion.base.cards;

import com.energy0124.energydominion.api.CardType;
import com.energy0124.energydominion.api.Cost;
import com.energy0124.energydominion.api.bahaviour.VPCountable;
import com.energy0124.energydominion.api.core.DominionCard;
import com.energy0124.energydominion.api.event.VPCountEvent;

/**
 * Created by Energy on 2/7/2014.
 */
public class Estate extends DominionCard implements VPCountable {

    public Estate() {
        super("Estate", CardType.Victory, new Cost(2), "+1 VP");
    }

    @Override
    public void onVPCount(VPCountEvent event) {
        super.onVPCount(event);
        event.getCardOwner().addVictoryPoint(1);
    }
}
