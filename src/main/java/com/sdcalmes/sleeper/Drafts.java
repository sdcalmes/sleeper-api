package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.DraftModels.DraftPick;
import com.sdcalmes.sleeper.LeagueModels.DraftPickTrade;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;
import java.util.List;

@Immutable
public interface Drafts {

    @GET("user/{user_id}/drafts/nfl/{season}")
    Call<List<Draft>> getAllDraftsForUser(@Path("user_id") String userId, @Path("season") String season);

    @GET("league/{league_id}/drafts")
    Call<List<Draft>> getDraftsForLeague(@Path("league_id") String leagueId);

    @GET("draft/{draft_id}")
    Call<Draft> getDraft(@Path("draft_id") String draftId);

    @GET("draft/{draft_id}/picks")
    Call<List<DraftPick>> getDraftPicksFromDraft(@Path("draft_id") String draftId);

    @GET("draft/{draft_id}/traded_picks")
    Call<List<DraftPickTrade>> getTradedPicksForDraft(@Path("draft_id") String draftId);

}
