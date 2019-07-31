package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;

/**
 * The type Users.
 */
@Immutable
public final class UsersImpl
{

    private final transient Retrofit retrofit;

    /**
     * Instantiates a new Users.
     *
     * @param retrofit the retrofit
     */
    UsersImpl(final Retrofit retrofit)
    {
        this.retrofit = retrofit;
    }

    /**
     * Gets by username.
     *
     * @param username the username
     * @return the by username
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
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

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     * @throws SleeperError the sleeper error
     * @throws IOException  the io exception
     */
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
