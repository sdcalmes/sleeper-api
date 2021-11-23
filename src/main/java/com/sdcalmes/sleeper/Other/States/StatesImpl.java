package com.sdcalmes.sleeper.Other.States;

import com.sdcalmes.sleeper.Errors.ErrorUtils;
import com.sdcalmes.sleeper.Errors.SleeperError;
import com.sdcalmes.sleeper.Other.Sports;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;

@Immutable
public class StatesImpl {

    private final transient States statesEndpoint;

    public StatesImpl(final Retrofit retrofit)
    {

        this.statesEndpoint = retrofit.create(States.class);
    }

    /**
     * Return the state of the requested sport
     * @param sport sport, can be NFL, NBA or LCS
     * @return a State object
     * @throws SleeperError if Sleeper itself returns an error
     * @throws IOException if there is an extraneous issue
     */
    public State getSportState(Sports sport) throws SleeperError, IOException
    {
        State state;
        Response<State> r = statesEndpoint.getSportState(sport).execute();
        if(r.isSuccessful())
        {
            state = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return state;
    }
}
