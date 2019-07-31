package com.sdcalmes.sleeper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;

/**
 * The interface Users.
 */
@Immutable
interface Users {

    /**
     * Gets by username.
     *
     * @param username the username
     * @return the by username
     */
    @GET("user/{username}")
    Call<User> getByUsername(@Path("username") String username);

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    @GET("user/{id}")
    Call<User> getById(@Path("id") String id);

}
