package com.se.project.game;

import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<Player> {
    private ArrayList<Player> players;
    private int teamID;

    public Team(int teamID) {
        initializeTeam(teamID, GameMaster.defaultTeamSize, GameMaster.defaultX, GameMaster.defaultY);
    }

    public Team(int teamID, int size) {
        initializeTeam(teamID, size, GameMaster.defaultX, GameMaster.defaultY);
    }

    public Team(int teamID, int size, int x, int y) {
        initializeTeam(teamID, size, x, y);
    }

    private void initializeTeam(int teamID, int size, int x, int y) {
        this.teamID = teamID;
        this.players = new ArrayList<Player>();
        for (int i = 0; i < size; i++){
            this.players.add(new Player(i, teamID, x, y));
        }
    }

    public Iterator<Player> iterator() {
        return players.iterator();
    }
}