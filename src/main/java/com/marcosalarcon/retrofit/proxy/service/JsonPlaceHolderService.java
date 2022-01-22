package com.marcosalarcon.retrofit.proxy.service;

import com.marcosalarcon.retrofit.domain.dto.PostResponseDTO;

import java.io.IOException;
import java.util.List;

public interface JsonPlaceHolderService {
    List<PostResponseDTO> getAllPosts() throws IOException;
}
