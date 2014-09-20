package org.hopto.energy.energydominion.api.core;

import org.hopto.energy.energydominion.api.*;

import javax.swing.*;


public class LocalPlayer implements Player {
    private Hand hand;
    private Deck deck;
    private Pile trash;
    private String name;
    private Game currentGame;
    private Pile discardPile;
    private int coin;
    private int potion;
    private int victoryPoint;

    public LocalPlayer() {
        this("Player");
    }

    public LocalPlayer(String name) {
        this(name, new Hand(), new Deck());
    }

    public LocalPlayer(String name, Hand hand, Deck deck) {
        this.hand = hand;
        this.deck = deck;
        this.name = name;
    }

    public int getVictoryPoint() {
        return victoryPoint;
    }

    public void setVictoryPoint(int victoryPoint) {
        this.victoryPoint = victoryPoint;
    }

    @Override
    public Game getCurrentGame() {
        return currentGame;
    }

    @Override
    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }

    @Override
    public Hand getHand() {

        return hand;
    }

    @Override
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public Deck getDeck() {
        return deck;
    }

    @Override
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drawCardFromDeck(int n) {
        for (int i = 1; i <= n; i++)
            getHand().addCard(getDeck().drawTopCard());
    }

    @Override
    public Pile getDiscardPile() {
        return this.discardPile;
    }

    public void setDiscardPile(Pile discardPile) {
        this.discardPile = discardPile;
    }

    @Override
    public void onTurnBegin() {


    }

    @Override
    public void onActionPhase() {
        //TODO: replace this with a better way for selecting card
       // hand.playCard(hand.getCards().get(Integer.parseInt(JOptionPane.showInputDialog("Which card do you want play?"))));

    }

    @Override
    public void onBuyPhase() {

    }

    @Override
    public void onCleanUpPhase() {

        hand.discardHand();
        drawCardFromDeck(5);

    }

    @Override
    public void onTurnEnd() {

    }

    @Override
    public void addCoin(int i) {
        setCoin(getCoin()+ i);
    }

    @Override
    public void addVictoryPoint(int i) {
        setVictoryPoint(getVictoryPoint()+i);
    }

    @Override
    public void addPotion(int i) {
        setPotion(getPotion() + i);
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }
}
