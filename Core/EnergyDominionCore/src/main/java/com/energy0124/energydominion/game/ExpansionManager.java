package com.energy0124.energydominion.game;


import com.energy0124.energydominion.EnergyDominion;
import com.energy0124.energydominion.api.Expansion;

import java.util.ArrayList;
import java.util.List;

public class ExpansionManager {
    private List<Expansion> expansions;
    // private Set<Class<? extends Card>> completeCardSet;


    public ExpansionManager() {
        this(new ArrayList<Expansion>());
    }

    public ExpansionManager(List<Expansion> expansions) {
        this.expansions = expansions;
    }

    public void add(Expansion expansion) {
        expansions.add(expansion);
    }

    public void register(Expansion expansion) {
        add(expansion);
        //todo:do not reference to EnergyDominion
        EnergyDominion.getCardManager().registerCards(expansion.getCardClassSet());
        //completeCardSet.addAll(expansion.getCardClassSet());

    }

    public List<Expansion> getExpansions() {
        return expansions;
    }
}
