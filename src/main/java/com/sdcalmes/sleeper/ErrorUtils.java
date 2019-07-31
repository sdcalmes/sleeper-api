package com.sdcalmes.sleeper;

import retrofit2.Response;

class ErrorUtils {

    public static SleeperError parseError(Response<?> response) {
        SleeperError error = new SleeperError();
        error.setMessage(response.message());
        error.setStatusCode(response.code());
        error.setRequestUrl(response.raw().request().url().toString());
        return error;
    }

}
