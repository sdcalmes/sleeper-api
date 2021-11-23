package com.sdcalmes.sleeper.Draft.DraftModels;

import java.util.List;
import java.util.Map;

/**
 * The type Draft.
 */
public class Draft {

    private String type;
    private String status;
    private long start_time;
    private String sport;
    private DraftSettings settings;
    private String season_type;
    private String season;
    private DraftMetadata metadata;
    private String league_id;
    private long last_picked;
    private long last_message_time;
    private Map<String, Integer> draft_order;
    private String last_message_id;
    private String draft_id;
    private List<String> creators;
    private long created;

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public long getStart_time() {
        return start_time;
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
    public DraftSettings getSettings() {
        return settings;
    }

    /**
     * Gets season type.
     *
     * @return the season type
     */
    public String getSeason_type() {
        return season_type;
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
     * Gets metadata.
     *
     * @return the metadata
     */
    public DraftMetadata getMetadata() {
        return metadata;
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
     * Gets last picked.
     *
     * @return the last picked
     */
    public long getLast_picked() {
        return last_picked;
    }

    /**
     * Gets last message time.
     *
     * @return the last message time
     */
    public long getLast_message_time() {
        return last_message_time;
    }

    /**
     * Gets draft order.
     *
     * @return the draft order
     */
    public Map<String, Integer> getDraft_order() {
        return draft_order;
    }

    /**
     * Gets last message id.
     *
     * @return the last message id
     */
    public String getLast_message_id() {
        return last_message_id;
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
     * Gets creators.
     *
     * @return the creators
     */
    public List<String> getCreators() {
        return creators;
    }

    /**
     * Gets created.
     *
     * @return the created
     */
    public long getCreated() {
        return created;
    }
}
