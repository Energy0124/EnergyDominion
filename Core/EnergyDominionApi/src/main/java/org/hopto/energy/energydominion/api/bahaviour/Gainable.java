package org.hopto.energy.energydominion.api.bahaviour;

import org.hopto.energy.energydominion.api.event.GainEvent;

public interface Gainable {
    void onGain(GainEvent event);
}
