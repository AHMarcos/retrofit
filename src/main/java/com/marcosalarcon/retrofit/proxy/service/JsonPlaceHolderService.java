package com.marcosalarcon.retrofit.proxy.service;

import com.marcosalarcon.retrofit.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.dto.PostResponseDTO;

import java.io.IOException;
import java.util.List;

public interface JsonPlaceHolderService {
    List<PostResponseDTO> getAllPosts() throws IOException;

    PostResponseDTO getAllPostsById(int id) throws IOException;

    List<CommentsResponseDTO> getAllPostsByIdComments(int id) throws IOException;

    List<CommentsResponseDTO> getAllPostsCommentsById(int postId) throws IOException;

    PostResponseDTO addNewPosts(PostResponseDTO postResponseDTO) throws IOException;

    PostResponseDTO updatePostsById(int id) throws IOException;

    void deletePostsById(int id) throws IOException;


}
