package com.sdcalmes.sleeper.Player;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;
import java.util.Map;

/**
 * The interface Players.
 */
@Immutable
interface Players {

    /**
     * Gets all players. Use sparingly and cache results.
     *
     * @return the all players
     */
    @GET("v1/players/nfl")
    Call<Map<String, Player>> getAllPlayers();

    // This api doesn't use the 'v1' like all the others.
    @GET("players/nfl/{player_id}")
    Call<Player> getPlayerByPlayerID(@Path("player_id") String playerId);

}
