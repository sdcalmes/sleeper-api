package com.sdcalmes.sleeper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

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
    @GET("stats/nfl/{season_type}/{season}/{week}")
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
    @GET("stats/nfl/{season_type}/{season}")
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
    @GET("projections/nfl/{season_type}/{season}/{week}")
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
    @GET("projections/nfl/{season_type}/{season}")
    Call<Map<String, Stat>> getSeasonProjections(@Path("season_type") String season_type,
                                                 @Path("season") String season);

}
