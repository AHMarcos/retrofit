package com.marcosalarcon.retrofit.proxy.impl;

import com.marcosalarcon.retrofit.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.proxy.api.JsonPlaceHolderApi;
import com.marcosalarcon.retrofit.proxy.service.JsonPlaceHolderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class JsonPlaceHolderServiceImpl implements JsonPlaceHolderService {

    private final JsonPlaceHolderApi jsonPlaceHolderApiTwo;

    @Override
    public List<PostResponseDTO> getAllPosts() throws IOException {
        return jsonPlaceHolderApiTwo.getAllPosts()
                .execute()
                .body();
    }

    @Override
    public PostResponseDTO getAllPostsById(int id) throws IOException {
        return jsonPlaceHolderApiTwo.getAllPostsById(id)
                .execute()
                .body();
    }

    @Override
    public List<CommentsResponseDTO> getAllPostsByIdComments(int id) throws IOException {
        return jsonPlaceHolderApiTwo.getAllPostsByIdComments(id)
                .execute()
                .body();
    }

    @Override
    public List<CommentsResponseDTO> getAllPostsCommentsById(int postId) throws IOException {
        return jsonPlaceHolderApiTwo.getAllPostsCommentsById(postId)
                .execute()
                .body();
    }

    @Override
    public PostResponseDTO addNewPosts(PostResponseDTO postResponseDTO) throws IOException {
        return jsonPlaceHolderApiTwo.addNewPosts(postResponseDTO)
                .execute()
                .body();
    }

    @Override
    public PostResponseDTO updatePostsById(int id) throws IOException {
        return jsonPlaceHolderApiTwo.updatePostsById(id)
                .execute()
                .body();
    }

    @Override
    public void deletePostsById(int id) throws IOException {
        jsonPlaceHolderApiTwo.deletePostsById(id)
                .execute();
    }

}
