package com.example.parcial2.domain.dto.response.provider;

import com.example.parcial2.common.Type;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProviderResponse {
    private String name;
    private Type type;
}
