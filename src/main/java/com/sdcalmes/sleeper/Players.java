package com.sdcalmes.sleeper;

import retrofit2.Call;
import retrofit2.http.GET;

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
    @GET("players/nfl")
    Call<Map<String, Player>> getAllPlayers();

}
