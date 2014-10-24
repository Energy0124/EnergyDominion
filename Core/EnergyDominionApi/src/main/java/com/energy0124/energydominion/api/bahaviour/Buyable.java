package com.energy0124.energydominion.api.bahaviour;

import com.energy0124.energydominion.api.event.BuyEvent;

public interface Buyable {
    void onBuy(BuyEvent event);
}
