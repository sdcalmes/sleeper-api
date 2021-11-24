package com.sdcalmes.sleeper.Player;

import com.sdcalmes.sleeper.Errors.ErrorUtils;
import com.sdcalmes.sleeper.Errors.SleeperError;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.Map;

/**
 * The type Player.
 */
@Immutable
public final class PlayerImpl
{

    private final transient Players playersEndpoint;

    /**
     * Instantiates a new Player.
     *
     * @param retrofit the retrofit
     */
    public PlayerImpl(final Retrofit retrofit)
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

    /**
     * Return a player object from a player ID
     * @param playerId ID of the player you want to retrieve
     * @return Player object with player details
     * @throws SleeperError if Sleeper itself has an error
     * @throws IOException if there is an extraneous issue
     */
    public Player getPlayerByPlayerId(String playerId) throws SleeperError, IOException
    {
        Player player;
        Response<Player> r = playersEndpoint.getPlayerByPlayerID(playerId).execute();
        if (r.isSuccessful())
        {
           player = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return player;
    }
}
