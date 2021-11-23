package com.sdcalmes.sleeper.Draft;

import com.sdcalmes.sleeper.Draft.DraftModels.Draft;
import com.sdcalmes.sleeper.Draft.DraftModels.DraftPick;
import com.sdcalmes.sleeper.League.LeagueModels.DraftPickTrade;
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
    @GET("v1/user/{user_id}/drafts/nfl/{season}")
    Call<List<Draft>> getAllDraftsForUser(@Path("user_id") String userId, @Path("season") String season);

    /**
     * Gets drafts for league.
     *
     * @param leagueId the league id
     * @return the drafts for league
     */
    @GET("v1/league/{league_id}/drafts")
    Call<List<Draft>> getDraftsForLeague(@Path("league_id") String leagueId);

    /**
     * Gets draft.
     *
     * @param draftId the draft id
     * @return the draft
     */
    @GET("v1/draft/{draft_id}")
    Call<Draft> getDraft(@Path("draft_id") String draftId);

    /**
     * Gets draft picks from draft.
     *
     * @param draftId the draft id
     * @return the draft picks from draft
     */
    @GET("v1/draft/{draft_id}/picks")
    Call<List<DraftPick>> getDraftPicksFromDraft(@Path("draft_id") String draftId);

    /**
     * Gets traded picks for draft.
     *
     * @param draftId the draft id
     * @return the traded picks for draft
     */
    @GET("v1/draft/{draft_id}/traded_picks")
    Call<List<DraftPickTrade>> getTradedPicksForDraft(@Path("draft_id") String draftId);

}
