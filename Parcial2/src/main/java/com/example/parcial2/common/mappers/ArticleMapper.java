package com.example.parcial2.common.mappers;

import com.example.parcial2.domain.dto.request.article.ArticleRequest;
import com.example.parcial2.domain.dto.request.article.UpdateArticleRequest;
import com.example.parcial2.domain.dto.request.provider.ProviderRequest;
import com.example.parcial2.domain.dto.request.provider.UpdateProviderRequest;
import com.example.parcial2.domain.dto.response.article.ArticleResponse;
import com.example.parcial2.domain.dto.response.provider.ProviderResponse;
import com.example.parcial2.domain.entities.Article;
import com.example.parcial2.domain.entities.Provider;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {
    public Article toEntityCreate(ArticleRequest articleRequest){
        return Article.builder()
                .name(articleRequest.getName())
                .type(articleRequest.getType())
                .price(articleRequest.getPrice())
                .magicProvider(articleRequest.getProvider())
                .build();
    }

    public ArticleResponse toDto(Article article){
        return ArticleResponse.builder()
                .name(article.getName())
                .type(article.getType())
                .build();
    }

    public Article toEntityUpdate(UpdateArticleRequest updateArticleRequest, Long id){
        return Article.builder()
                .id(id)
                .name(updateArticleRequest.getName())
                .type(updateArticleRequest.getType())
                .build();
    }
}
