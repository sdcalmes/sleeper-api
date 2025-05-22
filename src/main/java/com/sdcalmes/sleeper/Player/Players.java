package com.sdcalmes.sleeper.Player;

import com.sdcalmes.sleeper.Other.NflLeague.Teams;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query; // Add this import

import javax.annotation.concurrent.Immutable;
import java.util.List;
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

    // This api doesn't use the 'v1' like all the others.
    @GET("players/nfl/{player_id}")
    Call<Player> getPlayerByPlayerID(@Path("player_id") String playerId);

    @GET("players/nfl/{team_abbr}/depth_chart")
    Call<DepthChart> getTeamDepthChart(@Path("team_abbr") Teams team_abbr);

    @GET("players/nfl/trending/{type}")
    Call<List<TrendingPlayer>> getTrendingPlayers(
            @Path("type") TrendingType type,
            @Query("lookback_hours") Integer lookbackHours,
            @Query("limit") Integer limit
    );
}
