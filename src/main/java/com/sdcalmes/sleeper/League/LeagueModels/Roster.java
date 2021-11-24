package com.sdcalmes.sleeper.League.LeagueModels;

import java.util.List;

public class Roster {

    private List<String> starters;
    private RosterSettings settings;
    private int roster_id;
    private List<String> players;
    private String owner_id;
    private String league_id;

    public List<String> getStarters() {
        return starters;
    }

    public RosterSettings getSettings() {
        return settings;
    }

    public int getRoster_id() {
        return roster_id;
    }

    public List<String> getPlayers() {
        return players;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public String getLeague_id() {
        return league_id;
    }
}
