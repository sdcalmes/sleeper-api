package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Player.
 */
@Immutable
public class PlayerImpl
{

    private final transient Players playersEndpoint;

    /**
     * Instantiates a new Player.
     *
     * @param retrofit the retrofit
     */
    PlayerImpl(final Retrofit retrofit)
    {
        playersEndpoint = retrofit.create(Players.class);
    }

    /**
     * Gets all players.
     *
     * @return the all players
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public Map<String, Player> getAllPlayers() throws SleeperError, IOException
    {
        Map<String, Player> playerMap;
        Response<Map<String, Player>> r = playersEndpoint.getAllPlayers().execute();
        if (r.isSuccessful())
        {
            playerMap = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }

        return playerMap;
    }
}
