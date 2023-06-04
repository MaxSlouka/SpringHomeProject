package com.example.contentcalendar.controller;

import com.example.contentcalendar.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private ContentCollectionRepository repository;

    public ContentController() {
        repository = new ContentCollectionRepository();
    }
}
