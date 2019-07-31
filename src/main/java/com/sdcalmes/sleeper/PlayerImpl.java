package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Immutable
public class PlayerImpl
{

    private final transient Players playersEndpoint;

    PlayerImpl(final Retrofit retrofit)
    {
        playersEndpoint = retrofit.create(Players.class);
    }

    public Map<String, Player> getAllPlayers() throws SleeperError, IOException
    {
        Map<String, Player> playerMap = new HashMap<>();
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
