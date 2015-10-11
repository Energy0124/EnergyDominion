package com.energy0124.energydominion.expansion.base.cards;

import com.energy0124.energydominion.api.CardType;
import com.energy0124.energydominion.api.DominionCard;
import com.energy0124.energydominion.api.bahaviour.VPCountable;
import com.energy0124.energydominion.api.event.VPCountEvent;
import com.energy0124.energydominion.core.DominionGameManager;

/**
 * Created by Energy on 2/7/2014.
 */
public class Estate extends DominionCard implements VPCountable {

    public Estate() {
        super("Estate", CardType.Victory, DominionGameManager.getCostFactory().createCost().setTreasureCost(2).getCost(), "+1 VP");
    }

    @Override
    public void onVPCount(VPCountEvent event) {
        super.onVPCount(event);
        event.getCardOwner().addVictoryPoint(1);
    }
}
