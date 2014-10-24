package com.energy0124.energydominion.api.game;

import org.hopto.energy.energydominion.EnergyDominion;
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
        EnergyDominion.getCardManager().registerCards(expansion.getCardSet());
        //completeCardSet.addAll(expansion.getCardSet());

    }

    public List<Expansion> getExpansions() {
        return expansions;
    }
}
