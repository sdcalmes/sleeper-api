package com.sdcalmes.sleeper.League.LeagueModels.Playoffs;

public enum PlayoffBracketTypes {
    WINNERS {
        @Override
        public String toString() {
            return "winners";
        }
    },

    LOSERS {
        @Override
        public String toString() {
            return "losers";
        }
    }
}
