package com.example.parcial2.domain.dto.request.provider;

import com.example.parcial2.common.Type;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProviderRequest {
    @NotBlank(message = "Provider name cannot be empty.")
    private String name;

    @NotBlank(message = "Provider type cannot be empty.")
    private Type type;

}
