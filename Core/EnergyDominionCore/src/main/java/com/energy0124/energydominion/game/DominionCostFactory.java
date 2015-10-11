package com.energy0124.energydominion.game;

import com.energy0124.energydominion.api.Cost;
import com.energy0124.energydominion.core.CostFactory;
import core.DominionCost;

/**
 * Factory for creating a DominionCost object
 */
public class DominionCostFactory implements CostFactory {

    private Cost cost;

    @Override
    public CostFactory createCost() {
        cost = new DominionCost(0, 0);
        return this;
    }

    @Override
    public CostFactory setTreasureCost(int treasureCost) {

        cost.setTreasureCost(treasureCost);
        return this;
    }

    @Override
    public CostFactory setPotionCost(int potionCost) {
        cost.setPotionCost(potionCost);
        return this;
    }

    @Override
    public Cost getCost() {
        return cost;
    }
}
