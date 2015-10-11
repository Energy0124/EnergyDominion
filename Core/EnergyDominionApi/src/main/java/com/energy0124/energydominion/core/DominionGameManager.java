package com.energy0124.energydominion.core;

/**
 * Created by Energy on 16/07/2015.
 */
public class DominionGameManager {

    private static CostFactory costFactory;

    public static CostFactory getCostFactory() {
        return costFactory;
    }

    public static void setCostFactory(CostFactory costFactory) {
        DominionGameManager.costFactory = costFactory;
    }
}
