package com.sdcalmes.sleeper.Stats;

import com.sdcalmes.sleeper.Errors.ErrorUtils;
import com.sdcalmes.sleeper.Errors.SleeperError;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.Map;

/**
 * The type Stat.
 */
@Immutable
public final class StatImpl
{

    private final transient Stats statsEndpoint;

    /**
     * Instantiates a new Stat.
     *
     * @param retrofit the retrofit
     */
    public StatImpl (final Retrofit retrofit)
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

    /**
     * Return an individual player's weekly stats
     * @param playerId playerID you want the stats of
     * @param seasonType the season type (regular)
     * @param season the season stats you want (i.e. "2019")
     * @return a map of the stats where the key is the week and the value is a WeeklyPlayerStat object
     * @throws SleeperError if Sleeper itself has an error
     * @throws IOException if there is an extraneous issue
     */
    public Map<String, WeeklyPlayerStat> getWeeklyPlayerStatsBySeason(String playerId, String seasonType, String season) throws SleeperError, IOException
    {
        Map<String, WeeklyPlayerStat> statMap;

        Response<Map<String, WeeklyPlayerStat>> r = statsEndpoint.getPlayerStatsWeekly(playerId, seasonType, season).execute();
        if (r.isSuccessful())
        {
            statMap = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return statMap;
    }

    /**
     * Return an individual player's full season statistics
     * @param playerId ID of the player you want the stats of
     * @param seasonType the season type (i.e. "regular")
     * @param season the season stats you want (i.e. "2019");
     * @return a WeeklyPlayerStat object (which needs to be renamed)
     * @throws SleeperError if Sleeper itself has an error
     * @throws IOException if there is an extraneous issue
     */
    public WeeklyPlayerStat getSeasonPlayerStatsBySeason(String playerId, String seasonType, String season) throws SleeperError, IOException
    {
        WeeklyPlayerStat stats;

        Response<WeeklyPlayerStat> r =
                statsEndpoint.getSeasonPlayerStatsBySeason(playerId, seasonType, season).execute();
        if (r.isSuccessful())
        {
            stats = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return stats;
    }
}
