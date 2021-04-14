package com.example.Shop.service;

import com.example.Shop.model.News;

import java.util.List;


public interface NewsService {
    News getOne(Long id);

    List<News> findAll();

    void saveNewsInfoById(String title,
                          String information,
                          String filename,
                          Long id);

    News save(News news);

}