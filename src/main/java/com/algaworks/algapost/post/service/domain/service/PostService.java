package com.algaworks.algapost.post.service.domain.service;

import com.algaworks.algapost.post.service.api.model.PostInput;
import com.algaworks.algapost.post.service.api.model.PostOutput;
import com.algaworks.algapost.post.service.domain.model.PostEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {



    public PostOutput create(PostInput input) {
       var entity =  PostEntity.builder()
                .id(UUID.randomUUID())
                .title(input.getTitle())
                .body(input.getBody())
                .author(input.getAuthor())
                .build();

        return new PostOutput(entity.getId().toString(), entity.getTitle(), entity.getBody(),
                entity.getAuthor(), null, null);
    }
}
