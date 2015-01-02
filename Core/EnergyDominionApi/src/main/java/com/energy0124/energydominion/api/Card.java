package com.energy0124.energydominion.api;


import com.energy0124.energydominion.api.bahaviour.*;
import ro.fortsoft.pf4j.ExtensionPoint;

import java.util.List;

public interface Card extends ExtensionPoint, Buyable, Discardable, Drawable, Gainable, Playable, Trashable, VPCountable {

    String getName();

    void setName(String name);

    List<CardType> getType();

    String getDescription();

    //void onPlay();

    void setDescription(String description);

    Cost getCost();

    void setCost(Cost cost);

    List<CardType> getCardTypes();

    void setCardTypes(CardType cardType);

    void setCardTypes(List<CardType> cardTypes);

    Player getOwner();

    void setOwner(Player owner);


}
