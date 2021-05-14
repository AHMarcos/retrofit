package com.marcosalarcon.retrofit.service;

import com.marcosalarcon.retrofit.domain.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.domain.model.Post;

import java.io.IOException;
import java.util.List;

public interface JsonPlaceHolderService {

    public List<PostResponseDTO> getAllPosts() throws IOException;

    public List<CommentsResponseDTO> getAllComments(String postId);

    public PostResponseDTO createPost(Post post);

    public PostResponseDTO updatePost(Post post);

    public void deletePost();


}
