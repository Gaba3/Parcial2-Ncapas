package com.example.parcial2.domain.dto.request.article;

import com.example.parcial2.common.Type;
import com.example.parcial2.domain.entities.Provider;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateArticleRequest {
    private String name;
    private Type type;
    private  Double price;
    private Provider provider;
}
