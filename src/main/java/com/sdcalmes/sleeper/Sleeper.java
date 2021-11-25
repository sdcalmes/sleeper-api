package com.sdcalmes.sleeper;

import com.sdcalmes.sleeper.Draft.DraftImpl;
import com.sdcalmes.sleeper.League.LeagueImpl;
import com.sdcalmes.sleeper.Other.States.StatesImpl;
import com.sdcalmes.sleeper.Player.PlayerImpl;
import com.sdcalmes.sleeper.Stats.StatImpl;
import com.sdcalmes.sleeper.User.UsersImpl;

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

    /**
     * Stats stat.
     *
     * @return the stat
     */
    StatImpl stats();

}
