package com.example.parcial2.common.mappers;

import com.example.parcial2.domain.dto.request.provider.ProviderRequest;
import com.example.parcial2.domain.dto.request.provider.UpdateProviderRequest;
import com.example.parcial2.domain.dto.response.provider.ProviderResponse;
import com.example.parcial2.domain.entities.Provider;
import org.springframework.stereotype.Component;

@Component
public class ProviderMapper {
    public Provider toEntityCreate(ProviderRequest providerRequest){
        return Provider.builder()
                .name(providerRequest.getName())
                .type(providerRequest.getType())
                .build();
    }

    public ProviderResponse toDto(Provider provider){
        return ProviderResponse.builder()
                .name(provider.getName())
                .type(provider.getType())
                .build();
    }

    public Provider toEntityUpdate(UpdateProviderRequest updateProviderRequest, Long id){
        return Provider.builder()
                .id(id)
                .name(updateProviderRequest.getName())
                .type(updateProviderRequest.getType())
                .build();
    }
}
