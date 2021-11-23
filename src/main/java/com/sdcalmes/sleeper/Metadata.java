package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.Other.Sports;
import com.sdcalmes.sleeper.Other.States.State;

import java.io.IOException;

/**
 * This class exists to always have access to the states of the given sports. This allows other parts of the API to
 * access the sport states without needing to query the state endpoint.
 */
public class Metadata {

    final static SleeperApi sleeper = new SleeperApi();

    public static State getNflState() {
        return nflState;
    }

    public static State getNbaState() {
        return nbaState;
    }

    public static State getLcsState() {
        return lcsState;
    }


    private static State nflState;
    private static State nbaState;
    private static State lcsState;


    static {
        try {
            nflState = sleeper.states().getSportState(Sports.NFL);
            nbaState = sleeper.states().getSportState(Sports.NBA);
            lcsState = sleeper.states().getSportState(Sports.LCS);
        }
        catch (SleeperError | IOException sleeperError) {
            sleeperError.printStackTrace();
        }
    }

}
