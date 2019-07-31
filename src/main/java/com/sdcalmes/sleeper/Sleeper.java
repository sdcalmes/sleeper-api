package com.sdcalmes.sleeper;

import javax.annotation.concurrent.Immutable;

/**
 * The interface Sleeper.
 */
@Immutable
public interface Sleeper {

    /**
     * Users users.
     *
     * @return the users
     */
    UsersImpl users();

    /**
     * Leagues league.
     *
     * @return the league
     */
    LeagueImpl leagues();

    /**
     * Drafts draft.
     *
     * @return the draft
     */
    DraftImpl drafts();

    /**
     * Players player.
     *
     * @return the player
     */
    PlayerImpl players();

}
