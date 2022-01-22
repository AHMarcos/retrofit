package com.marcosalarcon.retrofit.proxy.api;

import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

import java.util.List;

public interface JsonPlaceHolderApi {
    @Headers("Accept: application/json")
    @GET("/posts")
    Call<List<PostResponseDTO>> getAllPosts();
}
