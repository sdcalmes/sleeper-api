package com.sdcalmes.sleeper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.Map;

interface Stats
{

    @GET("/stats/nfl/{season_type}/{season}/{week}")
    Call<Map<String, Stat>> getWeeklyStats(@Path("season_type") String season_type,
                                           @Path("season") String season,
                                           @Path("week") String week);

    @GET("/stats/nfl/{season_type}/{season}")
    Call<Map<String, Stat>> getSeasonStats(@Path("season_type") String season_type,
                                           @Path("season") String season);


    @GET("/projections/nfl/{season_type}/{season}/{week}")
    Call<Map<String, Stat>> getWeeklyProjections(@Path("season_type") String season_type,
                                                 @Path("season") String season,
                                                 @Path("week") String week);

    @GET("/projections/nfl/{season_type}/{season}")
    Call<Map<String, Stat>> getSeasonProjections(@Path("season_type") String season_type,
                                                 @Path("season") String season);

}
