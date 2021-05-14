package com.marcosalarcon.retrofit.service;

import com.marcosalarcon.retrofit.config.RetrofitConfig;
import com.marcosalarcon.retrofit.domain.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.domain.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.List;

@Service
public class JsonPlaceHolderServiceImpl implements JsonPlaceHolderService{

    @Autowired
    private RetrofitConfig retrofitConfig;


    @Override
    public List<PostResponseDTO> getAllPosts() throws IOException {
        return retrofitConfig
                .initJsonPlaceHolderApi().getAllPosts()
                .execute()
                .body();
    }

    @Override
    public List<CommentsResponseDTO> getAllComments(String postId) {
        return null;
    }

    @Override
    public PostResponseDTO createPost(Post post) {
        return null;
    }

    @Override
    public PostResponseDTO updatePost(Post post) {
        return null;
    }

    @Override
    public void deletePost() {

    }
}
