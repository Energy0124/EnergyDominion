package org.hopto.energy.energydominion.api;

import java.util.List;

public interface Game {
    List<Player> getPlayerList();

    void start();

    int getRound();
}
