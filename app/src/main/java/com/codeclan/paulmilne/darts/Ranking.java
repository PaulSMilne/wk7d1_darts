package com.codeclan.paulmilne.darts;
import java.util.*;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    private ArrayList<Player> leaderboard;

    public Ranking(){
        this.leaderboard = new ArrayList<Player>();

    }

    public ArrayList<Player> getLeaderboard() {
        return this.leaderboard;
    }

    public int countPlayers(){
        return leaderboard.size();
    }

    public void addPlayer(Player player){
        leaderboard.add(player);
    }

    public Player getPlayerWithRanking(int ranking){
        for (Player player : leaderboard){
            if (player.rank == ranking) {
               return player;
            }
        }
        return null;
    }

    public void replaceLastPlayer(Player player, int rank){
        int index = rank-1;
        player.setRank(rank);
        leaderboard.set(index, player);
    }
}
