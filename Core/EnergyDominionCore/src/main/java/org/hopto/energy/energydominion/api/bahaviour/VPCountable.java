package org.hopto.energy.energydominion.api.bahaviour;


import org.hopto.energy.energydominion.api.event.VPCountEvent;

public interface VPCountable {
    void onVPCount(VPCountEvent event);
}
