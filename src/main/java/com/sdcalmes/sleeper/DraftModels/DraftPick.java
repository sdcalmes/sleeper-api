package com.sdcalmes.sleeper.DraftModels;

public class DraftPick {

    private String player_id;
    private String picked_by;  //user_id this pick will go to (not all leagues have users in every slot, this can be "")
    private String roster_id; //roster the pick will go to
    private int round;
    private int draft_slot; //which column on the board
    private int pick_no;
    private DraftPickMetadata metadata;
    private boolean is_keeper;
    private String draft_id;

    public String getPlayer_id() {
        return player_id;
    }

    public String getPicked_by() {
        return picked_by;
    }

    public String getRoster_id() {
        return roster_id;
    }

    public int getRound() {
        return round;
    }

    public int getDraft_slot() {
        return draft_slot;
    }

    public int getPick_no() {
        return pick_no;
    }

    public DraftPickMetadata getMetadata() {
        return metadata;
    }

    public boolean isIs_keeper() {
        return is_keeper;
    }

    public String getDraft_id() {
        return draft_id;
    }
}
