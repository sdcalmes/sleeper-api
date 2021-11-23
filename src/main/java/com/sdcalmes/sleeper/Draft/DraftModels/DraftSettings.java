package com.sdcalmes.sleeper.Draft.DraftModels;

public class DraftSettings {

    private int teams;
    private int slots_wr;
    private int slots_rb;
    private int slots_te;
    private int slots_qb;
    private int slots_k;
    private int slots_flex;
    private int slots_def;
    private int slots_bn;
    private int rounds;
    private int player_type;
    private int pick_timer;
    private int cpu_autopick;
    private int alpha_sort;

    public int getTeams() {
        return teams;
    }

    public int getSlots_wr() {
        return slots_wr;
    }

    public int getSlots_rb() {
        return slots_rb;
    }

    public int getSlots_te() {
        return slots_te;
    }

    public int getSlots_qb() {
        return slots_qb;
    }

    public int getSlots_k() {
        return slots_k;
    }

    public int getSlots_flex() {
        return slots_flex;
    }

    public int getSlots_def() {
        return slots_def;
    }

    public int getSlots_bn() {
        return slots_bn;
    }

    public int getRounds() {
        return rounds;
    }

    public int getPlayer_type() {
        return player_type;
    }

    public int getPick_timer() {
        return pick_timer;
    }

    public int getCpu_autopick() {
        return cpu_autopick;
    }

    public int getAlpha_sort() {
        return alpha_sort;
    }
}
