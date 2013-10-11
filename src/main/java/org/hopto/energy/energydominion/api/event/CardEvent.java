package org.hopto.energy.energydominion.api.event;

import org.hopto.energy.energydominion.api.Player;

public interface CardEvent {
    void setCardOwner(Player owner);

    Player getCardOwner();

    void setTrigger(Player trigger);

    Player getTrigger();

}
