package com.marcosalarcon.retrofit.proxy.impl;

import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;
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
}
