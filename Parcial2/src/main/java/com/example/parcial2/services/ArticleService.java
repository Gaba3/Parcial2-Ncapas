package com.example.parcial2.services;

import com.example.parcial2.domain.dto.request.article.ArticleRequest;
import com.example.parcial2.domain.dto.request.article.UpdateArticleRequest;
import com.example.parcial2.domain.dto.response.article.ArticleResponse;
import com.example.parcial2.domain.entities.Article;

import java.util.List;

public interface ArticleService {
    ArticleResponse newArticle(ArticleRequest request);
    List<ArticleResponse> getAllArticles();
    ArticleResponse getArticleById(Long id);
    ArticleResponse updateArticle(Long id, UpdateArticleRequest request);
    Article deleteArticle(Long id);
}
