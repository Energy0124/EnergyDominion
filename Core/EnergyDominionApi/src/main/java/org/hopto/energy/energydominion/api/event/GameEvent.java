package org.hopto.energy.energydominion.api.event;

import org.hopto.energy.energydominion.api.Player;

/**
 * Created by Energy on 13年11月8日.
 */
public interface GameEvent {


    void setTrigger(Player trigger);

    Player getTrigger();
}
