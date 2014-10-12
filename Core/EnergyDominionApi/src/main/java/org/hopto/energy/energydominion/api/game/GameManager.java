package org.hopto.energy.energydominion.api.game;

import org.hopto.energy.energydominion.api.Deck;
import org.hopto.energy.energydominion.api.Game;
import org.hopto.energy.energydominion.api.Player;
import org.hopto.energy.energydominion.api.core.LocalGame;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private List<Game> gameList = new ArrayList<>();

    public List<Game> getGameList() {
        return gameList;
    }

    public Game createLocalGame(List<Player> playerList, Deck startingDeck) {
        Game game = new LocalGame(playerList, startingDeck);
        gameList.add(game);
        return game;

    }
}
