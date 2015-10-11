package com.energy0124.energydominion.core;

import com.energy0124.energydominion.api.Cost;

/**
 * Created by Energy on 16/07/2015.
 */
public interface CostFactory {

    CostFactory createCost();

    CostFactory setTreasureCost(int treasureCost);

    CostFactory setPotionCost(int potionCost);

    Cost getCost();

}
