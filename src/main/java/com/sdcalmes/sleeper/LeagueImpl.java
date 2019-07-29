package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.LeagueModels.*;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Immutable
public final class LeagueImpl {

 //   private final transient Retrofit retrofit;
    private final transient Leagues leaguesEndpoint;

    LeagueImpl(final Retrofit retrofit){
//        this.retrofit = retrofit;
        leaguesEndpoint = retrofit.create(Leagues.class);
    }

    public List<League> getAllLeaguesForUserBySeason(String userId, String season)
    {
        List<League> leagues = new ArrayList<>();
        try {
            Response<List<League>> r = leaguesEndpoint.getAllLeaguesForUserBySeason(userId, season).execute();
            leagues = r.body();
        } catch (IOException e) {
            System.err.println("FAIL GETTING ALL LEAGUES!");
            e.printStackTrace();
        }
        return leagues;
    }

    public League getById(String leagueId)
    {
        League league;
        try {
            Response<League> r = leaguesEndpoint.getById(leagueId).execute();
            league = r.body();
        } catch (IOException e) {
            league = new League();
            System.err.println("FAIL GETTING LEAGUE!");
            e.printStackTrace();
        }
        return league;
    }

    public List<Roster> getAllRostersInLeague(String leagueId)
    {
        List<Roster> rosters = new ArrayList<>();
        try {
            Response<List<Roster>> r = leaguesEndpoint.getAllRostersInLeague(leagueId).execute();
            rosters = r.body();
        } catch (IOException e) {
            System.err.println("FAIL GETTING ALL ROSTERS IN LEAGUE!");
            e.printStackTrace();
        }

        return rosters;
    }

    public List<User> getAllUsersInLeague(String leagueId)
    {
        List<User> users = new ArrayList<>();
        try {
            Response<List<User>> r = leaguesEndpoint.getAllUsersInLeague(leagueId).execute();
            users = r.body();
        } catch (IOException e) {
            System.err.println("FAIL GETTING USERS IN LEAGUE!");
            e.printStackTrace();
        }
        return users;
    }

    public List<Matchup> getMatchupsForWeek(String leagueId, String week)
    {
        List<Matchup> matchups = new ArrayList<>();
        try {
            Response<List<Matchup>> r = leaguesEndpoint.getMatchupsForWeek(leagueId, week).execute();
            matchups = r.body();
        } catch (IOException e) {
            System.err.println("FAIL GETTING USERS IN LEAGUE!");
            e.printStackTrace();
        }
        return matchups;
    }


    public List<Transaction> getTransactions(String leagueId, String week)
    {
        List<Transaction> transactions = new ArrayList<>();
        try {
            Response<List<Transaction>> r = leaguesEndpoint.getTransactions(leagueId, week).execute();
            transactions = r.body();
        } catch (IOException e) {
            System.err.println("FAIL GETTING USERS IN LEAGUE!");
            e.printStackTrace();
        }
        return transactions;
    }

    public List<DraftPickTrade> getTradedPicks(String leagueId)
    {
        List<DraftPickTrade> draftPickTrades = new ArrayList<>();
        try {
            Response<List<DraftPickTrade>> r = leaguesEndpoint.getTradedPicks(leagueId).execute();
            draftPickTrades = r.body();
        } catch (IOException e) {
            System.err.println("FAIL GETTING USERS IN LEAGUE!");
            e.printStackTrace();
        }
        return draftPickTrades;
    }




}
