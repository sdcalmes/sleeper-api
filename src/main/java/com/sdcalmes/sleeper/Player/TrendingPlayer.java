package com.sdcalmes.sleeper.Player;

import javax.annotation.concurrent.Immutable;

@Immutable
public class TrendingPlayer {
    private String player_id;
    private int count;

    public String getPlayerId() {
        return player_id;
    }

    public int getCount() {
        return count;
    }
}
