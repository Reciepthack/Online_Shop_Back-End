package com.example.Shop.controller;


import com.example.Shop.model.News;
import com.example.Shop.repo.NewsRepository;
import com.example.Shop.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/main")
public class MainController {

    private final NewsService newsService;
    private final NewsRepository newsRepository;

    @Autowired
    public MainController(NewsService newsService, NewsRepository newsRepository) {
        this.newsService = newsService;
        this.newsRepository = newsRepository;
    }

    @GetMapping
    public ResponseEntity<?> getAllNews(
//            @RequestParam(value = "page", required = false,defaultValue = "1") Integer page
    ) {
        List<News> newsPage = newsRepository.findAll();

        return new ResponseEntity<>(newsPage, HttpStatus.OK);
    }

    @GetMapping("/news/{id}")
    public ResponseEntity<?> getNews(@PathVariable("id") Long newsId) {
        News news = newsService.getOne(newsId);

        return new ResponseEntity<>(news, HttpStatus.OK);
    }
}
