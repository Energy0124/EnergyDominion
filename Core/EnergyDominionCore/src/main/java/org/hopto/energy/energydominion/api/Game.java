package org.hopto.energy.energydominion.api;

import java.util.List;

public interface Game {
    List<Player> getPlayerList();

    void setPlayerList(List<Player> playerList);

    //  void setPlayerList(ArrayList<Player> playerList);

    void start();

    void addPlayer(Player player);

    void removePlayer(Player player);

    int getRound();
}
