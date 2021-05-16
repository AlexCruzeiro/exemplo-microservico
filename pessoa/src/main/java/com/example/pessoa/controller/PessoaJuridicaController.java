package com.example.pessoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas")
public class PessoaJuridicaController {
    @GetMapping("/pessoajuridica")
    public String getPessoaFisica() {
        return "Pessoa juridica";
    }
}
