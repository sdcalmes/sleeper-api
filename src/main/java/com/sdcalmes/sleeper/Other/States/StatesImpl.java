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
    public SportState getSportState(Sports sport) throws SleeperError, IOException
    {
        SportState sportState;
        Response<SportState> r = statesEndpoint.getSportState(sport).execute();
        if(r.isSuccessful())
        {
            sportState = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }
        return sportState;
    }
}
