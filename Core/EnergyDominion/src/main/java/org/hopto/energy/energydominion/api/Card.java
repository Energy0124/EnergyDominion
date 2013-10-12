package org.hopto.energy.energydominion.api;


import java.util.List;

public interface Card {

    String getName();

    List<CardType> getType();

    String getDescription();

    Cost getCost();

    void onPlay();


    void setName(String name);

    void setDescription(String description);

    void setCost(Cost cost);

    List<CardType> getCardTypes();

    void setCardTypes(CardType cardType);

    void setCardTypes(List<CardType> cardTypes);

    Player getOwner();

    void setOwner(Player owner);


}
