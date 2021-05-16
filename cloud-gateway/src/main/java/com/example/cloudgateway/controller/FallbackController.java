package com.example.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/pessoaServiceFallback")
    public String pessoaServiceFallback() {
        return "O serviço de pessoas está demorando mais do que o esperado. Por favor tente novamente mais tarde.";
    }

    @GetMapping("/produtoServiceFallback")
    public String produtoServiceFallback() {
        return "O serviço de produtos está demorando mais do que o esperado. Por favor tente novamente mais tarde.";
    }
}
