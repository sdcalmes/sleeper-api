package com.sdcalmes.sleeper;

import retrofit2.Response;
import retrofit2.Retrofit;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;

@Immutable
public final class UsersImpl {

    private final transient Retrofit retrofit;

    UsersImpl(final Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public User getByUsername(String username)
    {

        User user;
        Users usersEndpoint = retrofit.create(Users.class);
        try {
            Response<User> r = usersEndpoint.getByUsername(username).execute();
            user = r.body();
        } catch (IOException e) {
            user = new User();
            System.err.println("FAIL!");
            e.printStackTrace();

        }

        return user;

    }

    public User getById(String id)
    {
        User user;
        Users usersEndpoint = retrofit.create(Users.class);
        try {
            Response<User> r = usersEndpoint.getById(id).execute();
            user = r.body();
        } catch (IOException e) {
            user = new User();
            System.err.println("FAIL!");
            e.printStackTrace();

        }

        return user;
    }
}
