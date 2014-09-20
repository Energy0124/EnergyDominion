package org.hopto.energy.energydominion.expansion.base.cards;

import org.hopto.energy.energydominion.api.CardType;
import org.hopto.energy.energydominion.api.Cost;
import org.hopto.energy.energydominion.api.bahaviour.VPCountable;
import org.hopto.energy.energydominion.api.core.DominionCard;
import org.hopto.energy.energydominion.api.event.VPCountEvent;

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
