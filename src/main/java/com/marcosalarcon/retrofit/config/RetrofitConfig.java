package com.marcosalarcon.retrofit.config;

import com.marcosalarcon.retrofit.proxy.JsonPlaceHolderApi;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class RetrofitConfig {

    @Value("${app.api.url}")
    private String API_URL;

    public JsonPlaceHolderApi initJsonPlaceHolderApi(){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        return retrofit.create(JsonPlaceHolderApi.class);
    }

}
