package com.sdcalmes.sleeper.Player;

public enum TrendingType {
    ADD("add"),
    DROP("drop");

    private final String type;

    TrendingType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
