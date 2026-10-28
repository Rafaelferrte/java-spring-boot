package com.example.ExercicioCadastrarEventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/cadastrar-evento")
    public String abrirFormulario() { return "cadastro"; }

    @PostMapping("/salvar-evento")
    public String checkin(
        @RequestParam("dataEvento") String dataEvento,
        @RequestParam("tipoIngresso") String tipoIngresso,
        @RequestParam("qtdPessoas") String qtdPessoas,
        @RequestParam("meiaEntrada") Boolean meiaEntrada,
        Model model
    ){

    }
}
