package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.DraftModels.DraftPick;
import com.sdcalmes.sleeper.LeagueModels.DraftPickTrade;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;
import java.util.List;

/**
 * The interface Drafts.
 */
@Immutable
interface Drafts {

    /**
     * Gets all drafts for user.
     *
     * @param userId the user id
     * @param season the season
     * @return the all drafts for user
     */
    @GET("user/{user_id}/drafts/nfl/{season}")
    Call<List<Draft>> getAllDraftsForUser(@Path("user_id") String userId, @Path("season") String season);

    /**
     * Gets drafts for league.
     *
     * @param leagueId the league id
     * @return the drafts for league
     */
    @GET("league/{league_id}/drafts")
    Call<List<Draft>> getDraftsForLeague(@Path("league_id") String leagueId);

    /**
     * Gets draft.
     *
     * @param draftId the draft id
     * @return the draft
     */
    @GET("draft/{draft_id}")
    Call<Draft> getDraft(@Path("draft_id") String draftId);

    /**
     * Gets draft picks from draft.
     *
     * @param draftId the draft id
     * @return the draft picks from draft
     */
    @GET("draft/{draft_id}/picks")
    Call<List<DraftPick>> getDraftPicksFromDraft(@Path("draft_id") String draftId);

    /**
     * Gets traded picks for draft.
     *
     * @param draftId the draft id
     * @return the traded picks for draft
     */
    @GET("draft/{draft_id}/traded_picks")
    Call<List<DraftPickTrade>> getTradedPicksForDraft(@Path("draft_id") String draftId);

}
