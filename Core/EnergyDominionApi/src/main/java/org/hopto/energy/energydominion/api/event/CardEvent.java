package org.hopto.energy.energydominion.api.event;

import org.hopto.energy.energydominion.api.Player;

public abstract interface CardEvent extends GameEvent {


    public Player getCardOwner();

    public void setCardOwner(Player owner);


}
