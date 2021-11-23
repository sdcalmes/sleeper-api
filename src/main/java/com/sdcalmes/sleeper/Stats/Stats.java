package com.sdcalmes.sleeper.Stats;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.Map;

/**
 * The interface Stats.
 */
interface Stats
{

    /**
     * Gets weekly stats.
     *
     * @param season_type the season type
     * @param season      the season
     * @param week        the week
     * @return the weekly stats
     */
    @GET("v1/stats/nfl/{season_type}/{season}/{week}")
    Call<Map<String, Stat>> getWeeklyStats(@Path("season_type") String season_type,
                                           @Path("season") String season,
                                           @Path("week") String week);

    /**
     * Gets season stats.
     *
     * @param season_type the season type
     * @param season      the season
     * @return the season stats
     */
    @GET("v1/stats/nfl/{season_type}/{season}")
    Call<Map<String, Stat>> getSeasonStats(@Path("season_type") String season_type,
                                           @Path("season") String season);


    /**
     * Gets weekly projections.
     *
     * @param season_type the season type
     * @param season      the season
     * @param week        the week
     * @return the weekly projections
     */
    @GET("v1/projections/nfl/{season_type}/{season}/{week}")
    Call<Map<String, Stat>> getWeeklyProjections(@Path("season_type") String season_type,
                                                 @Path("season") String season,
                                                 @Path("week") String week);

    /**
     * Gets season projections.
     *
     * @param season_type the season type
     * @param season      the season
     * @return the season projections
     */
    @GET("v1/projections/nfl/{season_type}/{season}")
    Call<Map<String, Stat>> getSeasonProjections(@Path("season_type") String season_type,
                                                 @Path("season") String season);

    @GET("stats/nfl/player/{player_id}?grouping=week")
    Call<Map<String, WeeklyPlayerStat>> getPlayerStatsWeekly(@Path("player_id") String player_id,
                                           @Query("season_type") String season_type,
                                           @Query("season") String season);

    @GET("stats/nfl/player/{player_id}?grouping=season")
    Call<WeeklyPlayerStat> getSeasonPlayerStatsBySeason(@Path("player_id") String player_id,
                                                        @Query("season_type") String season_type,
                                                        @Query("season") String season);

}
