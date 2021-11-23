package com.sdcalmes.sleeper.Stats;

import com.sdcalmes.sleeper.Other.Sports;
import com.sdcalmes.sleeper.Other.Teams;

public class WeeklyPlayerStat {

    private int week;
    private Teams team;
    private Sports sport;
    private String season_type;
    private String season;
    private String player_id;
    private Teams opponent;
    private String game_id;
    private String date;
    private String company;
    private String category;
    private Stat stats;

    public int getWeek() {
        return week;
    }

    public Teams getTeam() {
        return team;
    }

    public Sports getSport() {
        return sport;
    }

    public String getSeason_type() {
        return season_type;
    }

    public String getSeason() {
        return season;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public Teams getOpponent() {
        return opponent;
    }

    public String getGame_id() {
        return game_id;
    }

    public String getDate() {
        return date;
    }

    public String getCompany() {
        return company;
    }

    public String getCategory() {
        return category;
    }

    public Stat getStats() {
        return stats;
    }
}
