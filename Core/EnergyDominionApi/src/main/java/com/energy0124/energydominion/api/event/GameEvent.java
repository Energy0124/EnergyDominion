package com.energy0124.energydominion.api.event;

import com.energy0124.energydominion.api.Player;

/**
 * Created by Energy on 13年11月8日.
 */
public interface GameEvent {


    void setTrigger(Player trigger);

    Player getTrigger();
}
