package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.DraftModels.DraftPick;
import com.sdcalmes.sleeper.LeagueModels.DraftPickTrade;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Immutable
public final class DraftImpl
{

    private final transient Drafts draftsEndpoint;

    DraftImpl(final Retrofit retrofit)
    {
        draftsEndpoint = retrofit.create(Drafts.class);
    }

    public List<Draft> getAllDraftsForUser(String userId, String season) throws SleeperError, IOException
    {
        List<Draft> drafts = new ArrayList<>();
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

    public List<Draft> getDraftsForLeague(String leagueId) throws SleeperError, IOException
    {
        List<Draft> drafts = new ArrayList<>();
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

    public List<DraftPick> getDraftPicksFromDraft(String draftId) throws SleeperError, IOException
    {
        List<DraftPick> draftPicks = new ArrayList<>();
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

    public List<DraftPickTrade> getTradedPicksForDraft(String draftId) throws SleeperError, IOException
    {
        List<DraftPickTrade> draftPickTrades = new ArrayList<>();
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
