package com.sdcalmes.sleeper.League.LeagueModels.Playoffs;

public class PlayoffBracketEntry {

    private int r; //round for this matchup
    private int m; //match id for this matchup
    private int t1; //team 1 in this matchup
    private int t2; //team 2 in this matchup
    private int w; //roster id of the winner
    private int l; //roster id of the loser

    public int getRound() {
        return r;
    }

    public int getMatchID() {
        return m;
    }

    public int getTeam1RosterID() {
        return t1;
    }

    public int getTeam2RosterID() {
        return t2;
    }

    public int getWinnerRosterID() {
        return w;
    }

    public int getLoserRosterID() {
        return l;
    }
}
