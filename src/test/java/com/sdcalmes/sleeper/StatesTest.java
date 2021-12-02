package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.Other.Sports;
import com.sdcalmes.sleeper.Other.States.SportState;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class StatesTest {

    private final Sleeper sleeper = new SleeperApi();

    @Test
    public void testGettingSportStateForNFL() throws SleeperError, IOException
    {
        SportState sportState = Metadata.getSportState(Sports.NFL);
        assertNotNull("State does not exist!", sportState);
    }

    @Test
    public void testGettingSportStateForNBA() throws SleeperError, IOException
    {
        SportState sportState = Metadata.getSportState(Sports.NBA);
        assertNotNull("State does not exist!", sportState);
    }

    @Test
    public void testGettingSportStateForLCS() throws SleeperError, IOException
    {
        SportState sportState = Metadata.getSportState(Sports.LCS);
        assertNotNull("State does not exist!", sportState);
    }
}
