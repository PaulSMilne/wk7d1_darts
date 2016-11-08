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

    public Player getPlayerByIndex(int index){
        return leaderboard.get(index);
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
    public Player getPlayerByName(String findName){
        for (Player player : leaderboard){
            if (player.name == findName) {
                return player;
            }
        }
        return null;
    }

    public void moveUp(Player player){
        int currentRank = player.rank;
        Player playerDown = getPlayerWithRanking(currentRank-1);
        int newRank = currentRank-1;
        player.setRank(newRank);
        playerDown.setRank(currentRank);
        int downIndex = newRank-1;
        int upIndex = currentRank-1;

        Collections.swap(leaderboard, downIndex, upIndex);
    }

    public void moveDown(Player player){
        int currentRank = player.rank;
        Player playerUp = getPlayerWithRanking(currentRank+1);
        int newRank = currentRank+1;
        player.setRank(newRank);
        playerUp.setRank(currentRank);
        int downIndex = newRank-1;
        int upIndex = currentRank-1;

        Collections.swap(leaderboard, downIndex, upIndex);
    }
}
