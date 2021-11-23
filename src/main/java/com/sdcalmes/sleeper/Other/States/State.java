package com.sdcalmes.sleeper.Other.States;

import java.util.List;

public class State {

    private int week;
    private String season_type;
    private String season_start_date;
    private String season;
    private String previous_season;
    private int leg;
    private String league_season;
    private String league_create_season;
    private int display_week;

    private String promo_start_date;
    private String promo_end_date;
    private String previous_season_start_date;
    private String league_create_season_start_date;
    private List<String> promo_types;

    public int getWeek() {
        return week;
    }

    public String getSeason_type() {
        return season_type;
    }

    public String getSeason_start_date() {
        return season_start_date;
    }

    public String getSeason() {
        return season;
    }

    public String getPrevious_season() {
        return previous_season;
    }

    public int getLeg() {
        return leg;
    }

    public String getLeague_season() {
        return league_season;
    }

    public String getLeague_create_season() {
        return league_create_season;
    }

    public int getDisplay_week() {
        return display_week;
    }

    public String getPromo_start_date() {
        return promo_start_date;
    }

    public String getPromo_end_date() {
        return promo_end_date;
    }

    public String getPrevious_season_start_date() {
        return previous_season_start_date;
    }

    public String getLeague_create_season_start_date() {
        return league_create_season_start_date;
    }

    public List<String> getPromo_types() {
        return promo_types;
    }
}
