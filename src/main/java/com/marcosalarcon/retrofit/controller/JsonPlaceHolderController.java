package com.marcosalarcon.retrofit.controller;

import com.marcosalarcon.retrofit.domain.dto.CommentsResponseDTO;
import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.proxy.service.JsonPlaceHolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class JsonPlaceHolderController {

    private final JsonPlaceHolderService jsonPlaceHolderService;

    @GetMapping("/posts")
    public List<PostResponseDTO> getAllPosts() throws IOException {
        return jsonPlaceHolderService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public PostResponseDTO getAllPostsById(@PathVariable("id") int id) throws IOException {
        return jsonPlaceHolderService.getAllPostsById(id);
    }

    @GetMapping("/posts/{id}/comments")
    public List<CommentsResponseDTO> getAllPostsByIdComments(@PathVariable("id") int id) throws IOException {
        return jsonPlaceHolderService.getAllPostsByIdComments(id);
    }

    @GetMapping("/comments")
    public List<CommentsResponseDTO> getAllPostsCommentsById(@RequestParam("postId") int postId) throws IOException {
        return jsonPlaceHolderService.getAllPostsCommentsById(postId);
    }

    @PostMapping("/posts")
    public PostResponseDTO addNewPost(PostResponseDTO postResponseDTO) throws IOException {
        return jsonPlaceHolderService.addNewPosts(postResponseDTO);
    }

    @PutMapping("/posts/{id}")
    public PostResponseDTO updatePostsById(@PathVariable("id") int id) throws IOException {
        return jsonPlaceHolderService.updatePostsById(id);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePostsById(@PathVariable("id") int id) throws IOException {
        jsonPlaceHolderService.deletePostsById(id);
    }

}
