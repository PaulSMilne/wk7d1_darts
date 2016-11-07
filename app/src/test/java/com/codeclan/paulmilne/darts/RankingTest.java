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
    Ranking leaderboard;

    @Before
    public void before(){
        leaderboard = new Ranking();
        player1 = new Player("Odin Odinson", "One-Eye");
        player2 = new Player("Freya Freyasdottir", "Strongarm");
        player3 = new Player("Thor Odinson","The Hammer");
        player4 = new Player("Loki Odinson", "Tricky");
    }

    @Test
    public void canCountPlayers(){
        int count = leaderboard.countPlayers();
        assertEquals(0, count);
    }

    @Test
    public void canAddPlayersToLeaderboard() {
        leaderboard.addPlayer(player1);
        assertEquals(1, leaderboard.countPlayers());
    }

    @Test
    public void canGetPlayerWithRanking(){
        leaderboard.addPlayer(player1);
        leaderboard.addPlayer(player2);
        leaderboard.addPlayer(player3);
        Player thisPlayer = leaderboard.getPlayerWithRanking(2);
        assertEquals("Strongarm", thisPlayer.getNickname());
    }

    @Test
    public void canReplaceLastPlayer(){
        leaderboard.addPlayer(player1);
        leaderboard.addPlayer(player2);
        leaderboard.addPlayer(player3);


    }
}
