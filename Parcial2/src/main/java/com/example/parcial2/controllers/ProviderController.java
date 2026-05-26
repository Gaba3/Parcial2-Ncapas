package com.example.parcial2.controllers;

import com.example.parcial2.domain.dto.request.provider.ProviderRequest;
import com.example.parcial2.domain.dto.request.provider.UpdateProviderRequest;
import com.example.parcial2.domain.dto.response.GeneralResponse;
import com.example.parcial2.services.impl.ProviderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ProviderController {
    private final ProviderServiceImpl providerService;

    @PostMapping("/provider")
    public ResponseEntity<GeneralResponse> newProvider(@RequestBody ProviderRequest provider){
        return buildResponse(
            "Provider added successfully",
                HttpStatus.CREATED,
                providerService.newProvider(provider)
        );
    }

    @GetMapping("/providers/{id}")
    public ResponseEntity<GeneralResponse> getProductById(@PathVariable Long id) {
        return buildResponse("Provider found", HttpStatus.OK, providerService.getProviderById(id));
    }

    @PutMapping("/providers/{id}")
    public ResponseEntity<GeneralResponse> updateProduct(
            @PathVariable Long id,
            @RequestBody UpdateProviderRequest product
    ) {
        return buildResponse(
                "Provider updated successfully",
                HttpStatus.OK,
                providerService.updateProvider(id, product));
    }

    @DeleteMapping("/providers/{id}")
    public ResponseEntity<GeneralResponse> deleteProduct(@PathVariable Long id) {
        return buildResponse("Provider deleted successfully", HttpStatus.OK, providerService.deleteProvider(id));
    }

    public ResponseEntity<GeneralResponse> buildResponse(String message, HttpStatus status, Object data){
        String uri = ServletUriComponentsBuilder.fromCurrentRequestUri().build().getPath();
        return ResponseEntity.status(status)
                .body(GeneralResponse.builder()
                        .uri(uri)
                        .message(message)
                        .status(status.value())
                        .time(LocalDateTime.now())
                        .data(data)
                        .build()
                );
    }
}
