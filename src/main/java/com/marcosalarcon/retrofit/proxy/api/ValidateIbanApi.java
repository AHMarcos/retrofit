package com.marcosalarcon.retrofit.proxy.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ValidateIbanApi {
    @Headers("Accept: application/json")
    @GET("/validate_iban/{iban}")
    Call<Object> validateIban(@Path("iban") String iban);
}
