package org.hopto.energy.energydominion.api.bahaviour;

import org.hopto.energy.energydominion.api.event.PlayEvent;

public interface Playable {
    void onPlay(PlayEvent event);
}
