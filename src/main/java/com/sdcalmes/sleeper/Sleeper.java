package com.sdcalmes.sleeper;

import javax.annotation.concurrent.Immutable;

@Immutable
public interface Sleeper {

    UsersImpl users();

    LeagueImpl leagues();

    DraftImpl drafts();

    PlayerImpl players();

}
