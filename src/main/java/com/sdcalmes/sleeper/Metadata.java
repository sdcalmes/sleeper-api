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

    public static SportState getSportState(Sports sport) throws IOException, SleeperError {
        return sleeper.states().getSportState(sport);
    }

}
