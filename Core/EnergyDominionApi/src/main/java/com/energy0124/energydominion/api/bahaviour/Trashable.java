package com.energy0124.energydominion.api.bahaviour;

import com.energy0124.energydominion.api.event.TrashEvent;

public interface Trashable {
    void onTrash(TrashEvent event);
}
