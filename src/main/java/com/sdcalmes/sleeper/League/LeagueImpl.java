package com.sdcalmes.sleeper.League;

import com.sdcalmes.sleeper.Errors.ErrorUtils;
import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.League.LeagueModels.*;
import com.sdcalmes.sleeper.League.LeagueModels.Playoffs.PlayoffBracketEntry;
import com.sdcalmes.sleeper.League.LeagueModels.Playoffs.PlayoffBracketTypes;
import com.sdcalmes.sleeper.Metadata;
import com.sdcalmes.sleeper.Other.Sports;
import com.sdcalmes.sleeper.User.User;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.*;

/**
 * The type League.
 */
@Immutable
public final class LeagueImpl
{

    private final transient Leagues leaguesEndpoint;

    /**
     * Instantiates a new League.
     *
     * @param retrofit the retrofit
     */
    public LeagueImpl(final Retrofit retrofit)
    {
        leaguesEndpoint = retrofit.create(Leagues.class);
    }

    /**
     * Gets all leagues for user by season.
     *
     * @param userId the user id
     * @param season the season
     * @return the all leagues for user by season
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<League> getAllLeaguesForUserBySeason(String userId, String season) throws SleeperError, IOException
    {
        List<League> leagues;
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

    /**
     * Gets by id.
     *
     * @param leagueId the league id
     * @return the by id
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
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

    /**
     * Gets all rosters in league.
     *
     * @param leagueId the league id
     * @return the all rosters in league
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<Roster> getAllRostersInLeague(String leagueId) throws SleeperError, IOException
    {
        List<Roster> rosters;
        Response<List<Roster>> r = leaguesEndpoint.getAllRostersInLeague(leagueId).execute();
        if (r.isSuccessful())
        {
            rosters = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }

        return rosters;
    }

    /**
     * Gets all users in league.
     *
     * @param leagueId the league id
     * @return the all users in league
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<User> getAllUsersInLeague(String leagueId) throws SleeperError, IOException
    {
        List<User> users;
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

    /**
     * Gets matchups for week.
     *
     * @param leagueId the league id
     * @param week     the week
     * @return the matchups for week
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<Matchup> getMatchupsForWeek(String leagueId, String week) throws SleeperError, IOException
    {
        List<Matchup> matchups;
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


    /**
     * Gets transactions.
     *
     * @param leagueId the league id
     * @param week     the week
     * @return the transactions
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<Transaction> getTransactions(String leagueId, String week) throws SleeperError, IOException
    {
        List<Transaction> transactions;
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

    /**
     * Gets traded picks.
     *
     * @param leagueId the league id
     * @return the traded picks
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<DraftPickTrade> getTradedPicks(String leagueId) throws SleeperError, IOException
    {
        List<DraftPickTrade> draftPickTrades;
        Response<List<DraftPickTrade>> r = leaguesEndpoint.getTradedPicks(leagueId).execute();
        if (r.isSuccessful())
        {
            draftPickTrades = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return draftPickTrades;
    }

    /**
     * Gets the requested playoff bracket for the league.
     * @param leagueId ID of the league you want the playoff bracket of
     * @param bracketType either winner or loser bracket
     * @return List of PlayoffBracketEntry as referenced in the Sleeper API docs
     * @throws SleeperError if Sleeper itself returns an error
     * @throws IOException if there's an extraneous issue
     */

    public List<PlayoffBracketEntry> getPlayoffBracket(String leagueId, PlayoffBracketTypes bracketType) throws SleeperError,
            IOException
    {
        List<PlayoffBracketEntry> winnersBracket;
        Response<List<PlayoffBracketEntry>> r = leaguesEndpoint.getPlayoffBracket(leagueId, bracketType).execute();
        if(r.isSuccessful())
        {
            winnersBracket = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return winnersBracket;
    }

    /**
     * Returns all the transactions made for a given league
     * @param leagueId ID of the league you want the transactions of
     * @return Map with key being the week and the value being a list of transactions
     * @throws SleeperError if Sleeper itself returns an error
     * @throws IOException if there's an extraneous issue
     */
    public Map<String, List<Transaction>> getAllTransactionsForLeague(String leagueId) throws SleeperError, IOException
    {
        Map<String, List<Transaction>> transactionsMap = new HashMap<>();
        for (int i = 0; i <= Metadata.getSportState(Sports.NFL).getLeg(); ++i)
        {
            transactionsMap.put(Integer.toString(i), getTransactions(leagueId, Integer.toString(i)));
        }
        return transactionsMap;

    }

    /**
     * Return all the completed transactions for a league and by transaction type
     * @param leagueId ID of the league you want the transactions of
     * @param type transaction type, can be trade, waiver, free_agent or all
     * @return list of completed (successful) transactions of the given type
     * @throws SleeperError if Sleeper itself returns an error
     * @throws IOException if there's an extraneous issue
     */
    public List<Transaction> getAllCompletedTransactionsForLeagueByTransactionType(String leagueId,
                                                                                TransactionType type) throws SleeperError, IOException
    {
        List<Transaction> transactionsList = new ArrayList<>();
        Map<String, List<Transaction>> allTransactions = getAllTransactionsForLeague(leagueId);
        for (Map.Entry<String, List<Transaction>> weekOfTransactions : allTransactions.entrySet())
        {
            for (Transaction t : weekOfTransactions.getValue()) {
                if (!type.equals(TransactionType.all))
                {
                    if (t.getType().equals(type) && t.getStatus().equals("complete"))
                    {
                        transactionsList.add(t);
                    }
                }
                else
                {
                   if(t.getStatus().equals("complete"))
                   {
                       transactionsList.add(t);
                   }
                }
            }
        }

        return transactionsList;
    }

}
