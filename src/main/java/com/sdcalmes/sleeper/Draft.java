package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.DraftModels.DraftMetadata;
import com.sdcalmes.sleeper.DraftModels.DraftSettings;

import java.util.List;
import java.util.Map;

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

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public long getStart_time() {
        return start_time;
    }

    public String getSport() {
        return sport;
    }

    public DraftSettings getSettings() {
        return settings;
    }

    public String getSeason_type() {
        return season_type;
    }

    public String getSeason() {
        return season;
    }

    public DraftMetadata getMetadata() {
        return metadata;
    }

    public String getLeague_id() {
        return league_id;
    }

    public long getLast_picked() {
        return last_picked;
    }

    public long getLast_message_time() {
        return last_message_time;
    }

    public Map<String, Integer> getDraft_order() {
        return draft_order;
    }

    public String getLast_message_id() {
        return last_message_id;
    }

    public String getDraft_id() {
        return draft_id;
    }

    public List<String> getCreators() {
        return creators;
    }

    public long getCreated() {
        return created;
    }
}
