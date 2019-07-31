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

@Immutable
interface Leagues {

    @GET("user/{user_id}/leagues/nfl/{season}")
    Call<List<League>> getAllLeaguesForUserBySeason(@Path("user_id") String userId, @Path("season") String season);

    @GET("league/{league_id}")
    Call<League> getById(@Path("league_id") String leagueId);

    @GET("league/{league_id}/rosters")
    Call<List<Roster>> getAllRostersInLeague(@Path("league_id") String leagueId);

    @GET("league/{league_id}/users")
    Call<List<User>> getAllUsersInLeague(@Path("league_id") String leagueId);

    @GET("league/{league_id}/matchups/{week}")
    Call<List<Matchup>> getMatchupsForWeek(@Path("league_id") String leagueId, @Path("week") String week);

    @GET("league/{league_id}/transactions/{week}")
    Call<List<Transaction>> getTransactions(@Path("league_id") String leagueId, @Path("week") String week);

    @GET("league/{league_id}/traded_picks")
    Call<List<DraftPickTrade>> getTradedPicks(@Path("league_id") String leagueId);


}
