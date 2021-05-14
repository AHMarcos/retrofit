package com.marcosalarcon.retrofit.expose.web;

import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
import com.marcosalarcon.retrofit.service.JsonPlaceHolderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class JsonPlaceHolderController {

    @Autowired
    private JsonPlaceHolderServiceImpl service;

    @GetMapping("/posts")
    public ResponseEntity<List<PostResponseDTO>> getAllPosts() throws IOException {
        return ResponseEntity.ok(service.getAllPosts());
    }

}
