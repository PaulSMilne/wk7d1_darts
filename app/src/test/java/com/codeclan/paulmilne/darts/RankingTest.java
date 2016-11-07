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
    Ranking leaderboard;

    @Before
    public void before(){
        leaderboard = new Ranking();
        player1 = new Player("Odin Odinson", "One-Eye", 1);
        player2 = new Player("Freya Freyasdottir", "Strongarm", 2);
        player3 = new Player("Thor Odinson","The Hammer",3);
    }

    @Test
    public void canAddPlayersToLeaderboard() {
        Ranking list = leaderboard.addPlayer(player1);
        assertEquals("Odin Odinson", list(0).name);
    }
}
