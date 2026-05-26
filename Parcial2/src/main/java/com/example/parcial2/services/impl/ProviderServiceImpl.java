package com.example.parcial2.services.impl;

import com.example.parcial2.common.mappers.ProviderMapper;
import com.example.parcial2.domain.dto.request.provider.ProviderRequest;
import com.example.parcial2.domain.dto.request.provider.UpdateProviderRequest;
import com.example.parcial2.domain.dto.response.provider.ProviderResponse;
import com.example.parcial2.domain.entities.Provider;
import com.example.parcial2.exceptions.ResourceNotFoundException;
import com.example.parcial2.repository.ProviderRepository;
import com.example.parcial2.services.ProviderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements ProviderService {
    private final ProviderRepository providerRepository;
    private final ProviderMapper providerMapper;

    @Override
    public ProviderResponse newProvider(ProviderRequest provider){
        return providerMapper.toDto(
            providerRepository.save(
                    providerMapper.toEntityCreate(provider)
            )
        );
    }

    @Override
    public ProviderResponse getProviderById(Long id){
        return providerMapper.toDto(providerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Provider not found")));
    }

    @Transactional
    @Override
    public ProviderResponse updateProvider(Long id, UpdateProviderRequest provider){
        this.getProviderById(id);
        return providerMapper.toDto(
                providerRepository.save(
                        providerMapper.toEntityUpdate(provider, id)
                )
        );
    }

    @Override
    public Provider deleteProvider(Long id){
        Provider existsProvider = providerRepository.findProviderById(id);
        providerRepository.deleteById(id);
        return existsProvider;
    }
}