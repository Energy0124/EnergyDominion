package com.energy0124.energydominion.api.event;

import com.energy0124.energydominion.api.Player;

public abstract class DominionCardEvent implements CardEvent {
    private Player trigger;
    private Player owner;

    protected DominionCardEvent() {
        this(null);
    }

    protected DominionCardEvent(Player trigger) {
        this(trigger, null);
    }

    protected DominionCardEvent(Player trigger, Player owner) {
        this.trigger = trigger;
        this.owner = owner;
    }

    @Override
    public Player getCardOwner() {
        return owner;
    }

    @Override
    public void setCardOwner(Player owner) {
        this.owner = owner;


    }

    @Override
    public Player getTrigger() {
        return trigger;
    }

    @Override
    public void setTrigger(Player trigger) {
        this.trigger = trigger;

    }
}
