package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class StatImpl
{

    private final transient  Stats statsEndpoint;

    StatImpl (final Retrofit retrofit)
    {
        statsEndpoint = retrofit.create(Stats.class);
    }

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
