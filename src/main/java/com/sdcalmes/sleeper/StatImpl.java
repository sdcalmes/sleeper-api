package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Stat.
 */
class StatImpl
{

    private final transient  Stats statsEndpoint;

    /**
     * Instantiates a new Stat.
     *
     * @param retrofit the retrofit
     */
    StatImpl (final Retrofit retrofit)
    {
        statsEndpoint = retrofit.create(Stats.class);
    }

    /**
     * Gets weekly stats.
     *
     * @param seasonType the season type
     * @param season     the season
     * @param week       the week
     * @return the weekly stats
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public Map<String, Stat> getWeeklyStats(String seasonType, String season, String week) throws SleeperError, IOException
    {
        Map<String, Stat> statMap;
        Response<Map<String, Stat>> r = statsEndpoint.getWeeklyStats(seasonType, season, week).execute();
        if (r.isSuccessful())
        {
            statMap = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }

        return  statMap;
    }

    /**
     * Gets season stats.
     *
     * @param seasonType the season type
     * @param season     the season
     * @return the season stats
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public Map<String, Stat> getSeasonStats(String seasonType, String season) throws SleeperError, IOException
    {
        Map<String, Stat> statMap;
        Response<Map<String, Stat>> r = statsEndpoint.getSeasonStats(seasonType, season).execute();
        if (r.isSuccessful())
        {
            statMap = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return  statMap;
    }

    /**
     * Gets weekly projections.
     *
     * @param seasonType the season type
     * @param season     the season
     * @param week       the week
     * @return the weekly projections
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public Map<String, Stat> getWeeklyProjections(String seasonType, String season, String week) throws SleeperError, IOException
    {
        Map<String, Stat> statMap;
        Response<Map<String, Stat>> r = statsEndpoint.getWeeklyProjections(seasonType, season, week).execute();
        if (r.isSuccessful())
        {
            statMap = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return  statMap;
    }

    /**
     * Gets season projections.
     *
     * @param seasonType the season type
     * @param season     the season
     * @return the season projections
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public Map<String, Stat> getSeasonProjections(String seasonType, String season) throws SleeperError, IOException
    {
        Map<String, Stat> statMap;
        Response<Map<String, Stat>> r = statsEndpoint.getSeasonProjections(seasonType, season).execute();
        if (r.isSuccessful())
        {
            statMap = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }

        return  statMap;
    }
}
