package com.example.produto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class EstoqueController {
    @GetMapping("/estoque")
    public String getEstoque() {
        return "Estoque 1";
    }
}
