package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.LeagueModels.DraftPickTrade;
import com.sdcalmes.sleeper.LeagueModels.Matchup;
import com.sdcalmes.sleeper.LeagueModels.Roster;
import com.sdcalmes.sleeper.LeagueModels.Transaction;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;
import java.util.List;

/**
 * The interface Leagues.
 */
@Immutable
interface Leagues {

    /**
     * Gets all leagues for user by season.
     *
     * @param userId the user id
     * @param season the season
     * @return the all leagues for user by season
     */
    @GET("user/{user_id}/leagues/nfl/{season}")
    Call<List<League>> getAllLeaguesForUserBySeason(@Path("user_id") String userId, @Path("season") String season);

    /**
     * Gets by id.
     *
     * @param leagueId the league id
     * @return the by id
     */
    @GET("league/{league_id}")
    Call<League> getById(@Path("league_id") String leagueId);

    /**
     * Gets all rosters in league.
     *
     * @param leagueId the league id
     * @return the all rosters in league
     */
    @GET("league/{league_id}/rosters")
    Call<List<Roster>> getAllRostersInLeague(@Path("league_id") String leagueId);

    /**
     * Gets all users in league.
     *
     * @param leagueId the league id
     * @return the all users in league
     */
    @GET("league/{league_id}/users")
    Call<List<User>> getAllUsersInLeague(@Path("league_id") String leagueId);

    /**
     * Gets matchups for week.
     *
     * @param leagueId the league id
     * @param week     the week
     * @return the matchups for week
     */
    @GET("league/{league_id}/matchups/{week}")
    Call<List<Matchup>> getMatchupsForWeek(@Path("league_id") String leagueId, @Path("week") String week);

    /**
     * Gets transactions.
     *
     * @param leagueId the league id
     * @param week     the week
     * @return the transactions
     */
    @GET("league/{league_id}/transactions/{week}")
    Call<List<Transaction>> getTransactions(@Path("league_id") String leagueId, @Path("week") String week);

    /**
     * Gets traded picks.
     *
     * @param leagueId the league id
     * @return the traded picks
     */
    @GET("league/{league_id}/traded_picks")
    Call<List<DraftPickTrade>> getTradedPicks(@Path("league_id") String leagueId);


}
