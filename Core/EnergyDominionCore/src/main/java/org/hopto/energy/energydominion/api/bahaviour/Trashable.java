package org.hopto.energy.energydominion.api.bahaviour;

import org.hopto.energy.energydominion.api.event.TrashEvent;

public interface Trashable {
    void onTrash(TrashEvent event);
}
