package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.Other.Sports;
import com.sdcalmes.sleeper.Other.States.SportState;

import java.io.IOException;

/**
 * This static class exists to always have access to the states of the given sports from anywhere else in the code.
 */
public class Metadata {

    final static SleeperApi sleeper = new SleeperApi();

    // NFL has moved to an 18 week season in 2021. This shouldn't mess with any other Sleeper calls as anything that
    // goes to "18" should just return an empty object.
    private final static int nflNumberOfWeeks = 18;

    public static int getNflNumberOfWeeks() {
        return nflNumberOfWeeks;
    }

    public static SportState getSportState(Sports sport) throws IOException, SleeperError {
        return sleeper.states().getSportState(sport);
    }

}
