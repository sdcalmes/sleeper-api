package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.Player.Player;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private final Sleeper sleeper = new SleeperApi();

    /*
      TEST NOTE:
      We do not test the 'players' endpoint as sleeper asks not to hit the endpoint too often.
     */

    /**
     * Test getting a player by PlayerID
     *
     * @throws SleeperError will throw a SleeperError of sleeper itself returns an error
     * @throws IOException thrown if the object can't be serialized (?)
     */

    @Test
    public void testGetPlayerByPlayerId() throws SleeperError, IOException
    {
        String testPlayerId = "2028";
        Player p = sleeper.players().getPlayerByPlayerId(testPlayerId);
        assertEquals("Incorrect player returned!", p.getPlayer_id(), testPlayerId);
    }
}
