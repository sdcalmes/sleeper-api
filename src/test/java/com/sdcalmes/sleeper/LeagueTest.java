/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.League.League;
import com.sdcalmes.sleeper.League.LeagueModels.*;
import com.sdcalmes.sleeper.League.LeagueModels.Playoffs.PlayoffBracketEntry;
import com.sdcalmes.sleeper.League.LeagueModels.Playoffs.PlayoffBracketTypes;
import com.sdcalmes.sleeper.User.User;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class LeagueTest
{

    private final Sleeper sleeper = new SleeperApi();
    private final String leagueIdToTest = "586967580732862464";

    @Test
    public void testGettingLeaguesForUser() throws SleeperError, IOException
    {
        String userNameToTest = "sdcalmes";
        User user = sleeper.users().getByUsername(userNameToTest);
        List<League> leagues = sleeper.leagues().getAllLeaguesForUserBySeason(user.getUser_id(), "2019");
        assertEquals("Test user number of leagues mismatch!", leagues.size(), 2);
    }

    @Test
    public void testGetRosters() throws SleeperError, IOException
    {
        List<Roster> rosters = sleeper.leagues().getAllRostersInLeague(leagueIdToTest);
        assertEquals("Test number of rosters mismatch!", rosters.size(), 12);
    }

    @Test
    public void testGetUsersFromLeague() throws SleeperError, IOException
    {
        List<User> users = sleeper.leagues().getAllUsersInLeague(leagueIdToTest);
        assertEquals("Test number of league users mismatch!", users.size(), 12);
    }

    @Test
    public void testGetMatchupsForWeek() throws SleeperError, IOException
    {
        List<Matchup> matchups = sleeper.leagues().getMatchupsForWeek(leagueIdToTest, "10");
        assertEquals("Test number of matchups mismatch!", 12, matchups.size());
    }

    @Test
    public void testGetAllTransactionsByWeek() throws SleeperError, IOException
    {
        Map<String, List<Transaction>> transactions  = sleeper.leagues().getAllTransactionsForLeague(leagueIdToTest);
        List<Transaction> transactionList = new ArrayList<>();
        transactions.forEach((key, val) -> transactionList.addAll(val));
        assertEquals("Transaction list size not as expected!", 670, transactionList.size());
    }

    @Test
    public void testGetAllCompletedTransactionsForLeagueByTransactionType() throws SleeperError, IOException
    {
        List<Transaction> transactions =
                sleeper.leagues().getAllCompletedTransactionsForLeagueByTransactionType(leagueIdToTest,
                        TransactionType.waiver);
        assertEquals("No waivers! That can't be right.", 301, transactions.size());
    }

    @Test
    public void testGetAllCompletedTransactionsForLeague() throws SleeperError, IOException
    {
        List<Transaction> transactions =
                sleeper.leagues().getAllCompletedTransactionsForLeagueByTransactionType(leagueIdToTest,
                        TransactionType.all);
        assertEquals("Completed transactions size mismatch!", 448, transactions.size());
    }

    @Test
    public void testGetLeague() throws SleeperError, IOException
    {
        League league = sleeper.leagues().getById(leagueIdToTest);
        assertEquals("League received ID does not match expected ID!",
                leagueIdToTest, league.getLeague_id());
    }

    @Test
    public void testGetWinnersBracketOfLeague() throws SleeperError, IOException
    {
        List<PlayoffBracketEntry> bracket = sleeper.leagues().getPlayoffBracket(leagueIdToTest, PlayoffBracketTypes.WINNERS);
        assertEquals("Winner's bracket size mismatch!", 7, bracket.size());
    }

    @Test
    public void testGetLosersBracketOfLeague() throws SleeperError, IOException
    {
        List<PlayoffBracketEntry> bracket = sleeper.leagues().getPlayoffBracket(leagueIdToTest, PlayoffBracketTypes.LOSERS);
        assertEquals("Loser's bracket size mismatch!", 7, bracket.size());
    }
}
