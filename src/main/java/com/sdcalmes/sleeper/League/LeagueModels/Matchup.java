package com.sdcalmes.sleeper.League.LeagueModels;

import java.util.List;

public class Matchup {

    private List<String> starters;
    private List<String> players;
    private int roster_id;
    private double points;
    private int matchup_id;

    public List<String> getStarters() {
        return starters;
    }

    public List<String> getPlayers() {
        return players;
    }

    public int getRoster_id() {
        return roster_id;
    }

    public double getPoints() {
        return points;
    }

    public int getMatchup_id() {
        return matchup_id;
    }
}
