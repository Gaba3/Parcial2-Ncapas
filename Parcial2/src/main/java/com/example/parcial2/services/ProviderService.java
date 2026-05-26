package com.example.parcial2.services;

import com.example.parcial2.domain.dto.request.provider.ProviderRequest;
import com.example.parcial2.domain.dto.request.provider.UpdateProviderRequest;
import com.example.parcial2.domain.dto.response.provider.ProviderResponse;
import com.example.parcial2.domain.entities.Provider;
import jakarta.transaction.Transactional;

public interface ProviderService {
    ProviderResponse newProvider(ProviderRequest request);
    ProviderResponse getProviderById(Long id);
    ProviderResponse updateProvider(Long id, UpdateProviderRequest request);
    Provider deleteProvider(Long id);
}
