package com.example.parcial2.domain.dto.request.provider;

import com.example.parcial2.common.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProviderRequest {
    private String name;
    private Type type;
}
