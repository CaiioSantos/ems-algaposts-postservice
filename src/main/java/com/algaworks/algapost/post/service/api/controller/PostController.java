package com.algaworks.algapost.post.service.api.controller;

import com.algaworks.algapost.post.service.api.model.PostInput;
import com.algaworks.algapost.post.service.api.model.PostOutput;
import com.algaworks.algapost.post.service.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {

private final PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PostOutput create(@RequestBody PostInput input) {
        PostOutput output = postService.create(input);
        return output;
    }
}
