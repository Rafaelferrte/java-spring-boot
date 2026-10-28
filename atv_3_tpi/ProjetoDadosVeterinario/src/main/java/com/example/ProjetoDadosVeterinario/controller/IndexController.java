package com.example.ProjetoDadosVeterinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/sveterinario")
    public String abrirFormulario() {
        return "veterinario";
    }

    @PostMapping("/salvar-veterinario")
    public String salvar(
            @RequestParam("nomeVeterinario") String nomeVeterinario,
            @RequestParam("especializacao") String especializacao,
            @RequestParam("anosAtuacao") Integer anosAtuacao,
            @RequestParam("sexo") String sexo,
            @RequestParam("formacao") Integer formacao,
            Model model
    ) {
        model.addAttribute("nomeVeterinario", nomeVeterinario);
        model.addAttribute("especializacao", especializacao);
        model.addAttribute("anosAtuacao", anosAtuacao);
        model.addAttribute("sexo", sexo);
        model.addAttribute("formacao", formacao);

        model.addAttribute("sucesso", true);

        return "veterinario";
    }
}