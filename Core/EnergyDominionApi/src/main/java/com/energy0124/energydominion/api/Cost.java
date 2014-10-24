package com.energy0124.energydominion.api;

public class Cost {

    private int treasureCost;
    private int potionCost;

    public Cost() {
        this(0);
    }

    public Cost(int treasureCost) {
        this(treasureCost, 0);
    }

    public Cost(int treasureCost, int potionCost) {
        this.potionCost = potionCost;
        this.treasureCost = treasureCost;
    }

    public int getPotionCost() {
        return potionCost;
    }

    public void setPotionCost(int potionCost) {
        this.potionCost = potionCost;
    }

    public int getTreasureCost() {
        return treasureCost;
    }

    public void setTreasureCost(int treasureCost) {
        this.treasureCost = treasureCost;
    }

    boolean needPotion() {
        if (getPotionCost() >= 0) return true;
        else return false;
    }
}
