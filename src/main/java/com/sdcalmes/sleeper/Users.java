package com.sdcalmes.sleeper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;

@Immutable
public interface Users {

    @GET("user/{username}")
    Call<User> getByUsername(@Path("username") String username);

    @GET("user/{id}")
    Call<User> getById(@Path("id") String id);

}
