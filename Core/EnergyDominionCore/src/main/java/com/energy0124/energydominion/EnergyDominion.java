package com.energy0124.energydominion;

import com.energy0124.energydominion.api.*;
import com.energy0124.energydominion.core.DominionGameManager;
import com.energy0124.energydominion.game.CardManager;
import com.energy0124.energydominion.game.DominionCostFactory;
import com.energy0124.energydominion.game.ExpansionManager;
import com.energy0124.energydominion.game.GameManager;
import core.DominionDeck;
import core.LocalPlayer;
import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.PluginManager;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EnergyDominion {
    private static PluginManager pluginManager;
    private static GameManager gameManager;
    private static CardManager cardManager;
    private static ExpansionManager expansionManager;
    private static String pluginPath = "expansions/";
    private static boolean useDefaultBaseSet = true;

    public static void main(String[] args) {

        // System.out.println(System.getProperty("pf4j.pluginsDir", "plugins"));
        pluginManager = new DefaultPluginManager(new File(pluginPath));
        // pluginManager = new DefaultPluginManager();
        gameManager = new GameManager();
        pluginManager.loadPlugins();
        pluginManager.startPlugins();


        init();

        //simple test to check whether the expansion can be loaded
        test(pluginManager);

        //another test
        List<Player> playerList = new ArrayList(Arrays.asList(new LocalPlayer("Energy"), new LocalPlayer("Star")));     //create sample list of player
        Deck startingDeck = new DominionDeck();
        Game testGame = gameManager.createLocalGame(playerList, startingDeck);    //create a test game

        testGame.start();                                    //start the test game


    }

    private static void init() {
        DominionGameManager.setCostFactory(new DominionCostFactory());


    }

    private static void test(PluginManager pm) {

        //todo: fix the bug that no expansion is found
        //may related to :
        //  * if (type.isAssignableFrom(extensionClass) && extensionClass.isAnnotationPresent(Extension.class)) {
        //use debug to check

        List<DominionExpansion> expansions = pm.getExtensions(DominionExpansion.class);
        List<Card> cards = pm.getExtensions(Card.class);
        // List<Card> cards = pm.getExtensions(Card.class);
      /*  for (Card card : cards) {
            System.out.println("--------------------------------------");
            System.out.println(card.getClass().toString());
            System.out.println(card.getName());
            System.out.println("--------------------------------------");
        }              */
        for (Expansion expansion : expansions) {

            System.out.println("--------------------------------------");
            System.out.println(expansion.getClass().toString());
            System.out.println(expansion.toString());
            System.out.println("Name: " + expansion.getName());
            if (expansion instanceof Expansion) {
                System.out.println("IsExpansion: True");
            }
            System.out.println("CardList:");
            System.out.println(expansion.getCardClassSet().toString());
            for (Class card : expansion.getCardClassSet()) {
                System.out.println("**********");
                System.out.println(card.getSimpleName());
                try {
                    System.out.println(card.newInstance().toString());
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.out.println("**********");
            }
            System.out.println("--------------------------------------");
        }

        for (Card card : cards) {
            System.out.println(card.getCardClass());
        }
    }


    public static PluginManager getPluginManager() {
        return pluginManager;
    }

    public static void setPluginManager(PluginManager pluginManager) {
        EnergyDominion.pluginManager = pluginManager;
    }

    public static GameManager getGameManager() {
        return gameManager;
    }

    public static void setGameManager(GameManager gameManager) {
        EnergyDominion.gameManager = gameManager;
    }

    public static CardManager getCardManager() {
        return cardManager;
    }

    public static void setCardManager(CardManager cardManager) {
        EnergyDominion.cardManager = cardManager;
    }

    public static ExpansionManager getExpansionManager() {
        return expansionManager;
    }

    public static void setExpansionManager(ExpansionManager expansionManager) {
        EnergyDominion.expansionManager = expansionManager;
    }
}
