package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Other.NflLeague.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NflLeagueTest {

    @Test
    public void testGetConference()
    {
        assertEquals("Green Bay Packers are part of the NFC!", Teams.GB.getTeamConference(), Conferences.NFC);
    }

    @Test
    public void testGetDivision()
    {
        assertEquals("Green Bay Packers are part of the NFC North division!", Teams.GB.getTeamDivision(),
                Divisions.NFCNorth);
    }
}
