package com.sdcalmes.sleeper;

import retrofit2.Call;
import retrofit2.http.GET;

import javax.annotation.concurrent.Immutable;
import java.util.Map;

@Immutable
public interface Players {

    //PLEASE USE THIS SPARINGLY AND CACHE THE RESULTS
    @GET("players/nfl")
    Call<Map<String, Player>> getAllPlayers();

}
