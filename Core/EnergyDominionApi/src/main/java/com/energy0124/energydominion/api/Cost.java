package com.energy0124.energydominion.api;

public interface Cost {


    int getPotionCost();

    void setPotionCost(int potionCost);

    int getTreasureCost();

    void setTreasureCost(int treasureCost);

    boolean needPotion();
}
