package com.sdcalmes.sleeper.League;

import com.sdcalmes.sleeper.League.LeagueModels.*;
import com.sdcalmes.sleeper.League.LeagueModels.Playoffs.PlayoffBracketEntry;
import com.sdcalmes.sleeper.League.LeagueModels.Playoffs.PlayoffBracketTypes;
import com.sdcalmes.sleeper.User.User;
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
    @GET("v1/user/{user_id}/leagues/nfl/{season}")
    Call<List<League>> getAllLeaguesForUserBySeason(@Path("user_id") String userId, @Path("season") String season);

    /**
     * Gets league by id.
     *
     * @param leagueId the league id
     * @return the league by id
     */
    @GET("v1/league/{league_id}")
    Call<League> getById(@Path("league_id") String leagueId);

    /**
     * Gets all rosters in league.
     *
     * @param leagueId the league id
     * @return the all rosters in league
     */
    @GET("v1/league/{league_id}/rosters")
    Call<List<Roster>> getAllRostersInLeague(@Path("league_id") String leagueId);

    /**
     * Gets all users in league.
     *
     * @param leagueId the league id
     * @return the all users in league
     */
    @GET("v1/league/{league_id}/users")
    Call<List<User>> getAllUsersInLeague(@Path("league_id") String leagueId);

    /**
     * Gets matchups for week.
     *
     * @param leagueId the league id
     * @param week     the week
     * @return the matchups for week
     */
    @GET("v1/league/{league_id}/matchups/{week}")
    Call<List<Matchup>> getMatchupsForWeek(@Path("league_id") String leagueId, @Path("week") String week);

    /**
     * Gets transactions.
     *
     * @param leagueId the league id
     * @param week     the week
     * @return the transactions
     */
    @GET("v1/league/{league_id}/transactions/{week}")
    Call<List<Transaction>> getTransactions(@Path("league_id") String leagueId, @Path("week") String week);

    /**
     * Gets traded picks.
     *
     * @param leagueId the league id
     * @return the traded picks
     */
    @GET("v1/league/{league_id}/traded_picks")
    Call<List<DraftPickTrade>> getTradedPicks(@Path("league_id") String leagueId);

    /**
     * Get league playoff winners bracket
     * @param leagueId the league id
     * @return the winners bracket for this league
     */
    @GET("v1/league/{league_id}/{bracket_type}_bracket")
    Call<List<PlayoffBracketEntry>> getPlayoffBracket(@Path("league_id") String leagueId,
                                                      @Path("bracket_type") PlayoffBracketTypes bracketType);

}
