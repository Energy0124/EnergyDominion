package com.energy0124.energydominion.api.bahaviour;

import com.energy0124.energydominion.api.event.PlayEvent;

public interface Playable {
    void onPlay(PlayEvent event);
}
