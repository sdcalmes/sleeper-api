package com.sdcalmes.sleeper.Draft;

import com.sdcalmes.sleeper.Draft.DraftModels.Draft;
import com.sdcalmes.sleeper.Draft.DraftModels.DraftPick;
import com.sdcalmes.sleeper.Errors.ErrorUtils;
import com.sdcalmes.sleeper.League.LeagueModels.DraftPickTrade;
import com.sdcalmes.sleeper.Errors.SleeperError;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.List;

/**
 * The type Draft.
 */
@Immutable
public final class DraftImpl
{

    private final transient Drafts draftsEndpoint;

    /**
     * Instantiates a new Draft.
     *
     * @param retrofit the retrofit
     */
    public DraftImpl(final Retrofit retrofit)
    {
        draftsEndpoint = retrofit.create(Drafts.class);
    }

    /**
     * Gets all drafts for user.
     *
     * @param userId the user id
     * @param season the season
     * @return the all drafts for user
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<Draft> getAllDraftsForUser(String userId, String season) throws SleeperError, IOException
    {
        List<Draft> drafts;
            Response<List<Draft>> r = draftsEndpoint.getAllDraftsForUser(userId, season).execute();
            if (r.isSuccessful())
            {
                drafts = r.body();
            }
            else
            {
                throw ErrorUtils.parseError(r);
            }
        return drafts;
    }

    /**
     * Gets drafts for league.
     *
     * @param leagueId the league id
     * @return the drafts for league
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<Draft> getDraftsForLeague(String leagueId) throws SleeperError, IOException
    {
        List<Draft> drafts;
            Response<List<Draft>> r = draftsEndpoint.getDraftsForLeague(leagueId).execute();
            if (r.isSuccessful())
            {
                drafts = r.body();
            }
            else
            {
                throw ErrorUtils.parseError(r);
            }

        return drafts;
    }

    /**
     * Gets draft.
     *
     * @param draftId the draft id
     * @return the draft
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public Draft getDraft(String draftId) throws SleeperError, IOException
    {
        Draft d;
            Response<Draft> r = draftsEndpoint.getDraft(draftId).execute();
            if (r.isSuccessful())
            {
                d = r.body();
            }
            else
            {
                throw ErrorUtils.parseError(r);
            }

        return d;
    }

    /**
     * Gets draft picks from draft.
     *
     * @param draftId the draft id
     * @return the draft picks from draft
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<DraftPick> getDraftPicksFromDraft(String draftId) throws SleeperError, IOException
    {
        List<DraftPick> draftPicks;
            Response<List<DraftPick>> r = draftsEndpoint.getDraftPicksFromDraft(draftId).execute();
            if (r.isSuccessful())
            {
                draftPicks = r.body();
            }
            else
            {
                throw ErrorUtils.parseError(r);
            }

        return draftPicks;
    }

    /**
     * Gets traded picks for draft.
     *
     * @param draftId the draft id
     * @return the traded picks for draft
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
    public List<DraftPickTrade> getTradedPicksForDraft(String draftId) throws SleeperError, IOException
    {
        List<DraftPickTrade> draftPickTrades;
            Response<List<DraftPickTrade>> r = draftsEndpoint.getTradedPicksForDraft(draftId).execute();
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
}
