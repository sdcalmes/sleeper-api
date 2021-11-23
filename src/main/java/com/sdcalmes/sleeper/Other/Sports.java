package com.sdcalmes.sleeper.Other;

public enum Sports {
    NFL {
        @Override
        public String toString() {
            return "nfl";
        }
    },

    NBA {
        @Override
        public String toString() {
            return "nba";
        }
    },

    LCS {
        @Override
        public String toString() {
            return "lcs";
        }
    }

}
