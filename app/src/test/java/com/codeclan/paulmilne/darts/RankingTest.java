package com.codeclan.paulmilne.darts;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Paul Milne on 07/11/2016.
 */

public class RankingTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;
    Player player11;
    Ranking leaderboard;

    @Before
    public void before(){
        leaderboard = new Ranking();
        player1 = new Player("Odin Odinson", "One-Eye", 1);
        player2 = new Player("Frigg Friggdottir", "Strongarm", 2);
        player3 = new Player("Thor Odinson","The Hammer", 3);
        player4 = new Player("Loki Odinson", "Tricky",4);
        player5 = new Player("Sif Sifdottir", "Goldilocks",5);
        player6 = new Player("Baldr Odinson", "Dreamer",6);
        player7 = new Player("Hel Lokidottir", "Grumpy",7);
        player8 = new Player("Freyja Njörđrdottir", "Feathers",8);
        player9 = new Player("Freyr Njörđrson", "Sexy",9);
        player10 = new Player("Njörđr Njörđrson", "Tricky",10);
        player11 = new Player("Paul Milne", "Wonky", 11);
        leaderboard.addPlayer(player1);
        leaderboard.addPlayer(player2);
        leaderboard.addPlayer(player3);
        leaderboard.addPlayer(player4);
        leaderboard.addPlayer(player5);
        leaderboard.addPlayer(player6);
        leaderboard.addPlayer(player7);
        leaderboard.addPlayer(player8);
        leaderboard.addPlayer(player9);
        leaderboard.addPlayer(player10);

    }

    @Test
    public void canCountPlayers(){
        int count = leaderboard.countPlayers();
        assertEquals(10, count);
    }

    @Test
    public void canAddPlayersToLeaderboard() {
        leaderboard.addPlayer(player11);
        assertEquals(11, leaderboard.countPlayers());
    }

    @Test
    public void canGetPlayerWithRanking(){
        Player thisPlayer = leaderboard.getPlayerWithRanking(2);
        assertEquals("Strongarm", thisPlayer.getNickname());
    }

    @Test
    public void canReplaceLastPlayer(){
       leaderboard.replaceLastPlayer(player11, 10);
        Player thisPlayer = leaderboard.getPlayerWithRanking(10);
        assertEquals("Wonky", thisPlayer.getNickname());

    }

    @Test
    public void canGetPlayerByName(){
        Player thisPlayer = leaderboard.getPlayerByName("Freyr Njörđrson");
        assertEquals(9, thisPlayer.getRank());
    }

    @Test
    public void canMovePlayerUp(){
        leaderboard.moveUp(player7);
        Player playerUp = leaderboard.getPlayerByIndex(5);
        Player playerDown = leaderboard.getPlayerByIndex(6);
        assertEquals("Grumpy", playerUp.getNickname());
        assertEquals("Dreamer", playerDown.getNickname());
    }

    @Test
    public void canMovePlayerDown(){
        leaderboard.moveDown(player7);
        Player playerUp = leaderboard.getPlayerByIndex(6);
        Player playerDown = leaderboard.getPlayerByIndex(7);
        assertEquals("Feathers", playerUp.getNickname());
        assertEquals("Grumpy", playerDown.getNickname());
    }
}
