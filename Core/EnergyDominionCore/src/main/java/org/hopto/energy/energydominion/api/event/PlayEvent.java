package org.hopto.energy.energydominion.api.event;

import org.hopto.energy.energydominion.api.Player;

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
