package com.example.parcial2.repository;

import com.example.parcial2.domain.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
        Provider findProviderById(Long id);
}
