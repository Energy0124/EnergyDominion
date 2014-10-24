package com.energy0124.energydominion.api.bahaviour;


import com.energy0124.energydominion.api.event.VPCountEvent;

public interface VPCountable {
    void onVPCount(VPCountEvent event);
}
