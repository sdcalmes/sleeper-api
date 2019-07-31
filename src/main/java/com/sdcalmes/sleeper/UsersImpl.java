package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;

@Immutable
public final class UsersImpl
{

    private final transient Retrofit retrofit;

    UsersImpl(final Retrofit retrofit)
    {
        this.retrofit = retrofit;
    }

    public User getByUsername(String username) throws SleeperError, IOException
    {

        User user;
        Users usersEndpoint = retrofit.create(Users.class);
        Response<User> r = usersEndpoint.getByUsername(username).execute();
        if (r.isSuccessful())
        {
            user = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }

        return user;
    }

    public User getById(String id) throws SleeperError, IOException
    {
        User user;
        Users usersEndpoint = retrofit.create(Users.class);
        Response<User> r = usersEndpoint.getById(id).execute();
        if (r.isSuccessful())
        {
            user = r.body();
        }
        else
        {
            throw ErrorUtils.parseError(r);
        }

        return user;
    }
}
