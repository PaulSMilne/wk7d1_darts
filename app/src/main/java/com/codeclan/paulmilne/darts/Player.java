package com.codeclan.paulmilne.darts;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    public String name;
    public String nickname;
    public int rank;

    public Player(String name, String nickname, int rank) {
        this.name = name;
        this.nickname = nickname;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }

    public String setNickname(String newNickname){
        this.name = newNickname;
        return this.name;
    }

    public int getRank(){
        return this.rank;
    }

    public int setRank(int newRank) {
        this.rank = newRank;
        return this.rank;
    }
    //Custom toString method

    public String toString(){
        return "Name: " + this.name + ", Nickname: '" + this.nickname + "', Ranking: " + this.rank + ".";
    }
}
