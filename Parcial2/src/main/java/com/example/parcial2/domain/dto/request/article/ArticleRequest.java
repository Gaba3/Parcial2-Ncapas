package com.example.parcial2.domain.dto.request.article;

import com.example.parcial2.common.Type;
import com.example.parcial2.domain.entities.Provider;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleRequest {
    @NotBlank(message = "Provider name cannot be empty.")
    private String name;

    @NotBlank(message = "Provider type cannot be empty.")
    private Type type;

    @NotNull
    @Positive
    private Double price;

    private Provider provider;
}
