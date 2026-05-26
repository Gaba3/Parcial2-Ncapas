package com.example.parcial2.services.impl;

import com.example.parcial2.common.mappers.ProviderMapper;
import com.example.parcial2.domain.dto.request.provider.ProviderRequest;
import com.example.parcial2.domain.dto.request.provider.UpdateProviderRequest;
import com.example.parcial2.domain.dto.response.provider.ProviderResponse;
import com.example.parcial2.domain.entities.Provider;
import com.example.parcial2.exceptions.ResourceNotFoundException;
import com.example.parcial2.repository.ArticleRepository;
import com.example.parcial2.repository.ProviderRepository;
import com.example.parcial2.services.ArticleService;
import jakarta.transaction.Transactional;

public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

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
