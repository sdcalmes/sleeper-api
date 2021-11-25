package com.sdcalmes.sleeper.Other.States;


import com.sdcalmes.sleeper.Other.Sports;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.concurrent.Immutable;

@Immutable
interface States {

    @GET("v1/state/{sport}")
    Call<SportState> getSportState(@Path("sport") Sports sport);

}
