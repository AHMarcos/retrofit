package com.marcosalarcon.retrofit.controller;

import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.proxy.service.JsonPlaceHolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
