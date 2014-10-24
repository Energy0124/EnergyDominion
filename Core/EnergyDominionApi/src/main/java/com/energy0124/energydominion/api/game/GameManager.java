package com.energy0124.energydominion.api.game;

import com.energy0124.energydominion.api.Deck;
import com.energy0124.energydominion.api.Game;
import com.energy0124.energydominion.api.Player;
import com.energy0124.energydominion.api.core.LocalGame;

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
