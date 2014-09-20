package org.hopto.energy.energydominion.api.core;

import org.hopto.energy.energydominion.api.Board;
import org.hopto.energy.energydominion.api.Deck;
import org.hopto.energy.energydominion.api.Game;
import org.hopto.energy.energydominion.api.Player;

import java.util.ArrayList;
import java.util.List;

public class LocalGame implements Game {

    private List<Player> playerList;
    private int round = 0;
    private Board board;
    private boolean gameEnded = false;
    private Deck startingDeck;

    /*public LocalGame() {
        this(new ArrayList<Player>());
    }*/

    public LocalGame(List<Player> playerList,Deck startingDeck) {
        this.playerList = playerList;
        this.startingDeck=startingDeck;

        setup();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public void setGameEnded(boolean gameEnded) {
        this.gameEnded = gameEnded;
    }

    public Deck getStartingDeck() {
        return startingDeck;
    }

    public void setStartingDeck(Deck startingDeck) {
        this.startingDeck = startingDeck;
    }

    public void setup() {
    }

    @Override
    public List<Player> getPlayerList() {
        return playerList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

//    @Override
//    public void setPlayerList(ArrayList<Player> playerList) {
//        this.playerList = playerList;
//    }

    @Override
    public void start() {
        init();
        gameLoop();
    }

    private void gameLoop() {
        do {
            nextRound();

        } while (!gameEnded());

    }

    private boolean gameEnded() {
        return gameEnded;
    }

    public void init() {
        for (Player player : playerList) {
            Deck deck = getStartingDeck();


            //TODO:init

//            deck.setCards();
//            player.setDeck();
        }

    }

    @Override
    public void addPlayer(Player player) {
        playerList.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        playerList.remove(player);
    }

    @Override
    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void nextRound() {
        this.round++;
        playNewRound();

    }

    public void playNewRound() {
        for (Player player : playerList) {

            player.onTurnBegin();
            player.onActionPhase();
            player.onBuyPhase();
            player.onCleanUpPhase();
            player.onTurnEnd();


        }


    }
}
