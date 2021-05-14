package com.marcosalarcon.retrofit.proxy;

import com.marcosalarcon.retrofit.domain.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.domain.model.Post;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface JsonPlaceHolderApi {

    @GET("/posts")
    public Call<List<PostResponseDTO>> getAllPosts();

    @GET("/comments")
    public Call<List<CommentsResponseDTO>> getAllComments(@Query("postId") String postId);

    @POST("/posts")
    @Headers("Content-type: application/json; charset=UTF-8")
    public Call<PostResponseDTO> createPost(@Body Post post );

    @PUT("/posts/1")
    @Headers("Content-type: application/json; charset=UTF-8")
    public Call<PostResponseDTO> updatePost(@Body Post post );

    @DELETE("/posts/1")
    public Call<Void> deletePost();


}
