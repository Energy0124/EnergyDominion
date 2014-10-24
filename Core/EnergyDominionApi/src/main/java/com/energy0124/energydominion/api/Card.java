package com.energy0124.energydominion.api;


import com.energy0124.energydominion.api.bahaviour.*;
import net.xeoh.plugins.base.Plugin;

import java.util.List;

public interface Card extends Buyable, Discardable, Drawable, Gainable, Playable, Trashable, VPCountable, Plugin {

    String getName();

    void setName(String name);

    List<CardType> getType();

    String getDescription();

    //void onPlay();

    void setDescription(String description);

    Cost getCost();

    void setCost(Cost cost);

    List<CardType> getCardTypes();

    void setCardTypes(List<CardType> cardTypes);

    void setCardTypes(CardType cardType);

    Player getOwner();

    void setOwner(Player owner);


}
