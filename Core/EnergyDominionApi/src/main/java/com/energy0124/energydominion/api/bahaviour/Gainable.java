package com.energy0124.energydominion.api.bahaviour;

import com.energy0124.energydominion.api.event.GainEvent;

public interface Gainable {
    void onGain(GainEvent event);
}
