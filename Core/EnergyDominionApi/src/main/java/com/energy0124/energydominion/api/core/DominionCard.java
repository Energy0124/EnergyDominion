package com.energy0124.energydominion.api.core;

import com.energy0124.energydominion.api.Card;
import com.energy0124.energydominion.api.CardType;
import com.energy0124.energydominion.api.Cost;
import com.energy0124.energydominion.api.Player;
import com.energy0124.energydominion.api.event.*;

import java.util.ArrayList;
import java.util.List;


public abstract class DominionCard implements Card {
    private String name;
    private List<CardType> cardTypes;
    private Cost cost;
    private String description;
    private Player owner;


    protected DominionCard() {

        this("");
    }

    protected DominionCard(List<CardType> cardTypes) {
        this(cardTypes, new Cost());
    }

    protected DominionCard(CardType cardType) {
        this(cardType, new Cost());
    }

    protected DominionCard(String name, CardType cardType, Cost cost, String description, Player owner) {
        this(name, new ArrayList<CardType>(), cost, description, owner);
        setCardTypes(cardType);
    }

    protected DominionCard(String name) {
        this(name, new ArrayList<CardType>());
    }

    protected DominionCard(String name, List<CardType> cardTypes) {
        this(name, cardTypes, new Cost(), "", null);
    }

    protected DominionCard(String name, CardType cardType) {
        this(name, cardType, new Cost(), "", null);
    }

    protected DominionCard(String name, List<CardType> cardTypes, Cost cost) {
        this(name, cardTypes, cost, "", null);
    }

    protected DominionCard(String name, CardType cardType, Cost cost) {
        this(name, cardType, cost, "", null);
    }

    protected DominionCard(List<CardType> cardTypes, Cost cost) {
        this("", cardTypes, cost);
        setName(this.getClass().getSimpleName());
    }

    protected DominionCard(CardType cardType, Cost cost) {
        this("", cardType, cost);
        setName(this.getClass().getSimpleName());
    }

    protected DominionCard(String name, List<CardType> cardTypes, Cost cost, String description) {
        this(name, cardTypes, cost, description, null);

    }

    protected DominionCard(String name, CardType cardType, Cost cost, String description) {
        this(name, cardType, cost, description, null);

    }

    protected DominionCard(String name, List<CardType> cardTypes, Cost cost, String description, Player owner) {
        this.name = name;
        this.cardTypes = cardTypes;
        this.cost = cost;
        this.description = description;
        this.owner = owner;

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
    public List<CardType> getType() {
        return cardTypes;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Cost getCost() {
        return cost;
    }

    @Override
    public void setCost(Cost cost) {
        this.cost = cost;
    }

    @Override
    public List<CardType> getCardTypes() {
        return cardTypes;
    }

    @Override
    public void setCardTypes(List<CardType> cardTypes) {
        this.cardTypes = cardTypes;
    }

    @Override
    public void setCardTypes(CardType cardType) {
        List<CardType> cardTypes = new ArrayList<>();
        cardTypes.add(cardType);
        setCardTypes(cardTypes);
    }

    @Override
    public Player getOwner() {
        return owner;
    }

    @Override
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    @Override
    public void onBuy(BuyEvent event) {

    }


    @Override
    public void onDiscard(DiscardEvent event) {

    }

    @Override
    public void onDraw(DrawEvent event) {

    }

    @Override
    public void onGain(GainEvent event) {

    }

    @Override
    public void onPlay(PlayEvent event) {

    }

    @Override
    public void onTrash(TrashEvent event) {

    }

    @Override
    public void onVPCount(VPCountEvent event) {

    }


}
