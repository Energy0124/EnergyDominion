package com.energy0124.energydominion.api.event;

import com.energy0124.energydominion.api.Player;

public class PlayEvent extends DominionCardEvent {

    public PlayEvent() {
        super();
    }

    public PlayEvent(Player trigger) {
        super(trigger);
    }

    public PlayEvent(Player trigger, Player owner) {
        super(trigger, owner);
    }
}
