package com.sdcalmes.sleeper.League;

import com.sdcalmes.sleeper.League.LeagueModels.LeagueSettings;
import com.sdcalmes.sleeper.League.LeagueModels.LeagueStatus;
import com.sdcalmes.sleeper.League.LeagueModels.ScoringSettings;

import java.util.List;

/**
 * The type League.
 */
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

    /**
     * Gets total rosters.
     *
     * @return the total rosters
     */
    public int getTotal_rosters() {
        return total_rosters;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public LeagueStatus getStatus() {
        return status;
    }

    /**
     * Gets sport.
     *
     * @return the sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * Gets settings.
     *
     * @return the settings
     */
    public LeagueSettings getSettings() {
        return settings;
    }

    /**
     * Gets season type.
     *
     * @return the season type
     */
    public String getSeasonType() {
        return seasonType;
    }

    /**
     * Gets season.
     *
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     * Gets scoring settings.
     *
     * @return the scoring settings
     */
    public ScoringSettings getScoring_settings() {
        return scoring_settings;
    }

    /**
     * Gets roster positions.
     *
     * @return the roster positions
     */
    public List<String> getRoster_positions() {
        return roster_positions;
    }

    /**
     * Gets previous league id.
     *
     * @return the previous league id
     */
    public String getPrevious_league_id() {
        return previous_league_id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets league id.
     *
     * @return the league id
     */
    public String getLeague_id() {
        return league_id;
    }

    /**
     * Gets draft id.
     *
     * @return the draft id
     */
    public String getDraft_id() {
        return draft_id;
    }

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }
}
