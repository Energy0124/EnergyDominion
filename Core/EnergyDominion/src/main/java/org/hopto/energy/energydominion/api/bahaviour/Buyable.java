package org.hopto.energy.energydominion.api.bahaviour;

import org.hopto.energy.energydominion.api.event.BuyEvent;

public interface Buyable {
    void onBuy(BuyEvent event);
}
