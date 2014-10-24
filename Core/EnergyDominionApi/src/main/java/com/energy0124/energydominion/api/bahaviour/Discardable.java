package com.energy0124.energydominion.api.bahaviour;


import com.energy0124.energydominion.api.event.DiscardEvent;

public interface Discardable {
    void onDiscard(DiscardEvent event);
}
