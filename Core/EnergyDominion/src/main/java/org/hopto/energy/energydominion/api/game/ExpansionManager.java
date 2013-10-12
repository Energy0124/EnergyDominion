package org.hopto.energy.energydominion.api.game;

import org.hopto.energy.energydominion.api.Expansion;

import java.util.ArrayList;
import java.util.List;

public class ExpansionManager {
    private List<Expansion> expansionList;

    public ExpansionManager() {
        this(new ArrayList<Expansion>());
    }

    public ExpansionManager(List<Expansion> expansionList) {
        this.expansionList = expansionList;
    }

    public void add(Expansion expansion) {
        expansionList.add(expansion);
    }

    public void register() {

    }


}
