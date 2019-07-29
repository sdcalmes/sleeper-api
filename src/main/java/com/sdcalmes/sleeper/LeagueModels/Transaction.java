package com.sdcalmes.sleeper.LeagueModels;

import java.util.List;
import java.util.Map;

public class Transaction {

    private TransactionType type;
    private String transaction_id;
    private long status_updated;
    private String status;
    private List<Integer> roster_ids;
    private int leg; //week
    private Map<String, Integer> drops;
    private List<DraftPickTrade> draft_picks;
    private String creator; //user id who initiated
    private long created;
    private List<Integer> consenter_ids;
    private List<WaiverBudgetTrade> waiver_budget;

    public TransactionType getType() {
        return type;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public long getStatus_updated() {
        return status_updated;
    }

    public String getStatus() {
        return status;
    }

    public List<Integer> getRoster_ids() {
        return roster_ids;
    }

    public int getLeg() {
        return leg;
    }

    public Map<String, Integer> getDrops() {
        return drops;
    }

    public List<DraftPickTrade> getDraft_picks() {
        return draft_picks;
    }

    public String getCreator() {
        return creator;
    }

    public long getCreated() {
        return created;
    }

    public List<Integer> getConsenter_ids() {
        return consenter_ids;
    }

    public List<WaiverBudgetTrade> getWaiver_budget() {
        return waiver_budget;
    }
}
