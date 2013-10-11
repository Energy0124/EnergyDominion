package org.hopto.energy.energydominion.api.core;

import org.hopto.energy.energydominion.api.Game;
import org.hopto.energy.energydominion.api.Player;

import java.util.ArrayList;
import java.util.List;

public class LocalGame implements Game {

    private List<Player> playerList;
    private int round = 0;

    public LocalGame() {
        this(new ArrayList<Player>());
    }

    public LocalGame(List<Player> playerList) {
        this.playerList = playerList;
        init();
    }

    @Override
    public List<Player> getPlayerList() {
        return playerList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public void start() {
        init();
    }

    public void init() {

    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void removePlayer(Player player) {
        playerList.remove(player);
    }

    @Override
    public int getRound() {
        return round;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void nextRound() {
        this.round++;
        playNewRound();

    }

    public void playNewRound() {


    }
}
