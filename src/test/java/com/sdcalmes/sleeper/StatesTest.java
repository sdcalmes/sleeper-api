package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.Other.Sports;
import com.sdcalmes.sleeper.Other.States.State;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class StatesTest {

    private final Sleeper sleeper = new SleeperApi();

    @Test
    public void testGettingSportStateForNFL() throws SleeperError, IOException
    {
        State state = sleeper.states().getSportState(Sports.NFL);
        assertNotNull("State does not exist!", state);
    }

    @Test
    public void testGettingSportStateForNBA() throws SleeperError, IOException
    {
        State state = sleeper.states().getSportState(Sports.NBA);
        assertNotNull("State does not exist!", state);
    }

    @Test
    public void testGettingSportStateForLCS() throws SleeperError, IOException
    {
        State state = sleeper.states().getSportState(Sports.LCS);
        assertNotNull("State does not exist!", state);
    }
}
