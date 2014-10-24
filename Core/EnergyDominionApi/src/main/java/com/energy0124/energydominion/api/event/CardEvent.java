package com.energy0124.energydominion.api.event;

import com.energy0124.energydominion.api.Player;

public abstract interface CardEvent extends GameEvent {


    public Player getCardOwner();

    public void setCardOwner(Player owner);


}
