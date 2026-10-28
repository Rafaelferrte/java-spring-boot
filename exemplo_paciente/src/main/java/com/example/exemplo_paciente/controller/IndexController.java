package com.example.exemplo_paciente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/paciente")
    public String HomePaciente(Model model) {
        model.addAttribute("nome_paciente","Rafael");
        model.addAttribute("telefone_paciente","(13)99999-9999");
        return "paciente";
    }
}
