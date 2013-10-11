package org.hopto.energy.energydominion.api.bahaviour;


import org.hopto.energy.energydominion.api.event.DiscardEvent;

public interface Discardable {
    void onDiscard(DiscardEvent event);
}
