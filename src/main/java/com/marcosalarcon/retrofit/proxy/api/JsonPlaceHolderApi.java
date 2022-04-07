package com.marcosalarcon.retrofit.proxy.api;

import com.marcosalarcon.retrofit.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.dto.PostResponseDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Headers;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface JsonPlaceHolderApi {
    @Headers("Accept: application/json")
    @GET("/posts")
    Call<List<PostResponseDTO>> getAllPosts();

    @Headers("Accept: application/json")
    @GET("/posts/{id}")
    Call<PostResponseDTO> getAllPostsById(@Path("id") int id);

    @Headers("Accept: application/json")
    @GET("/posts/{id}/comments")
    Call<List<CommentsResponseDTO>> getAllPostsByIdComments(@Path("id") int id);

    @Headers("Accept: application/json")
    @GET("/comments")
    Call<List<CommentsResponseDTO>> getAllPostsCommentsById(@Query("postId") int postId);

    @Headers("Accept: application/json")
    @POST("/posts")
    Call<PostResponseDTO> addNewPosts(@Body PostResponseDTO postResponseDTO);

    @Headers("Accept: application/json")
    @PUT("/posts/{id}")
    Call<PostResponseDTO> updatePostsById(@Path("id") int id);

    @Headers("Accept: application/json")
    @DELETE("/posts/{id}")
    Call<Void> deletePostsById(@Path("id") int id);

}
