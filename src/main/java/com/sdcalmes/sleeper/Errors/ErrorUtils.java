package com.sdcalmes.sleeper.Errors;

import retrofit2.Response;

/**
 * The type Error utils.
 */
public class ErrorUtils {

    /**
     * Parse error sleeper error.
     *
     * @param response the response
     * @return the sleeper error
     */
    public static SleeperError parseError(Response<?> response) {
        SleeperError error = new SleeperError();
        error.setMessage(response.message());
        error.setStatusCode(response.code());
        error.setRequestUrl(response.raw().request().url().toString());
        return error;
    }

    public static UnsupportedOperationException createUserError(String msg) {
        return new UnsupportedOperationException(msg);
    }

}
