package com.sdcalmes.sleeper;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;

import java.io.IOException;
import java.lang.annotation.Annotation;

public class ErrorUtils {

    public static SleeperError parseError(Response<?> response) {
        SleeperError error = new SleeperError();
        error.setMessage(response.message());
        error.setStatusCode(response.code());
        error.setRequestUrl(response.raw().request().url().toString());
        return error;
    }

}
