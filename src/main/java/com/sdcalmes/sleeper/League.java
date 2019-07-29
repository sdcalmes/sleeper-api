package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.LeagueModels.LeagueSettings;
import com.sdcalmes.sleeper.LeagueModels.LeagueStatus;
import com.sdcalmes.sleeper.LeagueModels.ScoringSettings;

import java.util.List;

public class League {

    private int total_rosters;
    private LeagueStatus status;
    private String sport;
    private LeagueSettings settings;
    private String seasonType;
    private String season;
    private ScoringSettings scoring_settings;
    private List<String> roster_positions;
    private String previous_league_id;
    private String name;
    private String league_id;
    private String draft_id;
    private String avatar;

    public int getTotal_rosters() {
        return total_rosters;
    }

    public LeagueStatus getStatus() {
        return status;
    }

    public String getSport() {
        return sport;
    }

    public LeagueSettings getSettings() {
        return settings;
    }

    public String getSeasonType() {
        return seasonType;
    }

    public String getSeason() {
        return season;
    }

    public ScoringSettings getScoring_settings() {
        return scoring_settings;
    }

    public List<String> getRoster_positions() {
        return roster_positions;
    }

    public String getPrevious_league_id() {
        return previous_league_id;
    }

    public String getName() {
        return name;
    }

    public String getLeague_id() {
        return league_id;
    }

    public String getDraft_id() {
        return draft_id;
    }

    public String getAvatar() {
        return avatar;
    }
}
