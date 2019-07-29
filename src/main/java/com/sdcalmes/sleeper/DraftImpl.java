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
public class DraftImpl {

    private final transient Drafts draftsEndpoint;

    DraftImpl(final Retrofit retrofit) {
        draftsEndpoint = retrofit.create(Drafts.class);
    }

    public List<Draft> getAllDraftsForUser(String userId, String season) {
        List<Draft> drafts = new ArrayList<>();
        try {
            Response<List<Draft>> r = draftsEndpoint.getAllDraftsForUser(userId, season).execute();
            drafts = r.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drafts;
    }

    public List<Draft> getDraftsForLeague(String leagueId) {
        List<Draft> drafts = new ArrayList<>();
        try {
            Response<List<Draft>> r = draftsEndpoint.getDraftsForLeague(leagueId).execute();
            drafts = r.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drafts;
    }

    public Draft getDraft(String draftId) {
        Draft d;
        try {
            Response<Draft> r = draftsEndpoint.getDraft(draftId).execute();
            d = r.body();
        } catch (IOException e) {
            d = new Draft();
            System.err.println("FAIL GETTING DRAFT");
            e.printStackTrace();
        }
        return d;
    }

    public List<DraftPick> getDraftPicksFromDraft(String draftId) {
        List<DraftPick> draftPicks = new ArrayList<>();
        try {
            Response<List<DraftPick>> r = draftsEndpoint.getDraftPicksFromDraft(draftId).execute();
            draftPicks = r.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return draftPicks;
    }

    public List<DraftPickTrade> getTradedPicksForDraft(String draftId) {
        List<DraftPickTrade> draftPickTrades = new ArrayList<>();
        try {
            Response<List<DraftPickTrade>> r = draftsEndpoint.getTradedPicksForDraft(draftId).execute();
            draftPickTrades = r.body();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return draftPickTrades;
    }
}
