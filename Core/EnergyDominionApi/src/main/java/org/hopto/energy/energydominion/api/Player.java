package org.hopto.energy.energydominion.api;

public interface Player {
    Game getCurrentGame();

    void setCurrentGame(Game currentGame);

    Hand getHand();

    void setHand(Hand hand);

    Deck getDeck();

    void setDeck(Deck deck);

    String getName();

    void setName(String name);


    void onTurnBegin();

    void onBuyPhase();

    void onActionPhase();

    void onCleanUpPhase();

    void onTurnEnd();

    void drawCardFromDeck(int n);

    Pile getDiscardPile();

    void addCoin(int i);

    void addPotion(int i);

    void addVictoryPoint(int i);
}
