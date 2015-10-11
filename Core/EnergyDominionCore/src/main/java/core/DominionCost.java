package core;

import com.energy0124.energydominion.api.Cost;

/**
 * Created by Energy on 15/07/2015.
 */
public class DominionCost implements Cost {

    private int treasureCost;
    private int potionCost;

    public DominionCost() {
        this(0);
    }

    public DominionCost(int treasureCost) {
        this(treasureCost, 0);
    }

    public DominionCost(int treasureCost, int potionCost) {
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

    public boolean needPotion() {
        if (getPotionCost() >= 0) return true;
        else return false;
    }
}
