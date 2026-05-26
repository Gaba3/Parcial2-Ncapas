package com.example.parcial2.domain.dto.response.article;

import com.example.parcial2.common.Type;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Data
@Builder
public class ArticleResponse {
    private String name;
    private Type type;
    private Double price;
}
