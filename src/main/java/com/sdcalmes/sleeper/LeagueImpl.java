package com.sdcalmes.sleeper;

import com.google.gson.internal.$Gson$Preconditions;
import com.sdcalmes.sleeper.LeagueModels.*;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Immutable
public final class LeagueImpl
{

    private final transient Leagues leaguesEndpoint;

    LeagueImpl(final Retrofit retrofit)
    {
        leaguesEndpoint = retrofit.create(Leagues.class);
    }

    public List<League> getAllLeaguesForUserBySeason(String userId, String season) throws SleeperError, IOException
    {
        List<League> leagues = new ArrayList<>();
        Response<List<League>> r = leaguesEndpoint.getAllLeaguesForUserBySeason(userId, season).execute();
        if (r.isSuccessful())
        {
            leagues = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return leagues;
    }

    public League getById(String leagueId) throws SleeperError, IOException
    {
        League league;
        Response<League> r = leaguesEndpoint.getById(leagueId).execute();
        if (r.isSuccessful())
        {
            league = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return league;
    }

    public List<Roster> getAllRostersInLeague(String leagueId) throws SleeperError, IOException
    {
        List<Roster> rosters = new ArrayList<>();
        Response<List<Roster>> r = leaguesEndpoint.getAllRostersInLeague(leagueId).execute();
        if (r.isSuccessful())
        {
            rosters = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        rosters = r.body();

        return rosters;
    }

    public List<User> getAllUsersInLeague(String leagueId) throws SleeperError, IOException
    {
        List<User> users = new ArrayList<>();
        Response<List<User>> r = leaguesEndpoint.getAllUsersInLeague(leagueId).execute();
        if (r.isSuccessful())
        {
            users = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return users;
    }

    public List<Matchup> getMatchupsForWeek(String leagueId, String week) throws SleeperError, IOException
    {
        List<Matchup> matchups = new ArrayList<>();
        Response<List<Matchup>> r = leaguesEndpoint.getMatchupsForWeek(leagueId, week).execute();
        if (r.isSuccessful())
        {
            matchups = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return matchups;
    }


    public List<Transaction> getTransactions(String leagueId, String week) throws SleeperError, IOException
    {
        List<Transaction> transactions = new ArrayList<>();
        Response<List<Transaction>> r = leaguesEndpoint.getTransactions(leagueId, week).execute();
        if (r.isSuccessful())
        {
            transactions = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return transactions;
    }

    public List<DraftPickTrade> getTradedPicks(String leagueId) throws SleeperError, IOException
    {
        List<DraftPickTrade> draftPickTrades = new ArrayList<>();
        Response<List<DraftPickTrade>> r = leaguesEndpoint.getTradedPicks(leagueId).execute();
        draftPickTrades = r.body();
        return draftPickTrades;
    }

}
