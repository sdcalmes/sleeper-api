package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Draft.DraftModels.Draft;
import com.sdcalmes.sleeper.Draft.DraftModels.DraftPick;
import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.League.LeagueModels.DraftPickTrade;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DraftTest {

    private final Sleeper sleeper = new SleeperApi();
    private final String draftIdToTest = "716721398717947905";
    private final String draftWithTradedPicksToTest = "456849987641274368";
    private final String leagueIdToTest = "716721398717947904";
    private final String userIdToTest = "333314910077321216";
    private final String season = "2021";

    @Test
    public void testGettingDraftByID() throws SleeperError, IOException
    {
        Draft draft = sleeper.drafts().getDraft(draftIdToTest);
        assertEquals("Retrieved draft ID does not match requested!", draft.getDraft_id(), draftIdToTest);
    }

    @Test
    public void testGettingDraftsForLeague() throws SleeperError, IOException
    {
        List<Draft> drafts = sleeper.drafts().getDraftsForLeague(leagueIdToTest);
        assertTrue("No drafts returned for league!", drafts.size() > 0);
    }

    @Test
    public void testGettingAllDraftsForUser() throws SleeperError, IOException
    {
        List<Draft> allDraftsForUser = sleeper.drafts().getAllDraftsForUser(userIdToTest, season);
        assertTrue("No drafts returned for league!", allDraftsForUser.size() > 0);
    }

    @Test
    public void testGettingDraftPicksFromDraft() throws SleeperError, IOException
    {
        List<DraftPick> draftPicks = sleeper.drafts().getDraftPicksFromDraft(draftIdToTest);
        assertTrue("No draft picks returned from draft!", draftPicks.size() > 0);
    }

    @Test
    public void testGettingTradedDraftPicksFromDraft() throws SleeperError, IOException
    {
        List<DraftPickTrade> tradedDraftPicks = sleeper.drafts().getTradedPicksForDraft(draftWithTradedPicksToTest);
        assertTrue("No draft picks trades returned from draft!", tradedDraftPicks.size() > 0);
    }
}
