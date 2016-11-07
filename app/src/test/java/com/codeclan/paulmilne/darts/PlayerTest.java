package com.codeclan.paulmilne.darts;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {
    Player player;

    @Before
    public void before (){
        player = new Player("Fred Fredssonn", "Bullseye", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Fred Fredssonn", player.getName());
    }

    @Test
    public void canSetName(){
        player.setName("Olaf Fredssonn");
        assertEquals("Olaf Fredssonn", player.getName());
    }

    @Test
    public void canGetNickname(){
        assertEquals("Bullseye", player.getNickname());
    }

    @Test
    public void canSetNickname(){
        player.setNickname("Topper");
        assertEquals("Topper", player.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(1, player.getRank());
    }

    @Test
    public void canSetRank(){
        player.setRank(2);
        assertEquals(2, player.getRank());
    }
}
