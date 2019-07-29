package com.sdcalmes.sleeper.LeagueModels;

public class DraftPickTrade {

    private String season;
    private int round;
    private int roster_id; //original owner's roster id
    private int previous_owner_id; //previous owner roster id
    private int owner_id; //new owner

    public String getSeason() {
        return season;
    }

    public int getRound() {
        return round;
    }

    public int getRoster_id() {
        return roster_id;
    }

    public int getPrevious_owner_id() {
        return previous_owner_id;
    }

    public int getOwner_id() {
        return owner_id;
    }
}
