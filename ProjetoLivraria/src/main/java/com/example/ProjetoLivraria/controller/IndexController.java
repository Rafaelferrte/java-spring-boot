
package com.example.ProjetoLivraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/livraria")
    public String abrirFormulario() {
        return "livro";
    }

    @PostMapping("/salvar-livro")
    public String salvar(
            @RequestParam("nomeLivro") String nomeLivro,
            @RequestParam("isbn") String isbn,
            @RequestParam("paginas") Integer paginas,
            @RequestParam("autor") String autor,
            @RequestParam("editora") String editora,
            @RequestParam("categoria") String categoria,
            Model model
    ) {
        model.addAttribute("nomeLivro", nomeLivro);
        model.addAttribute("isbn", isbn);
        model.addAttribute("paginas", paginas);
        model.addAttribute("autor", autor);
        model.addAttribute("editora", editora);
        model.addAttribute("categoria", categoria);

        model.addAttribute("sucesso", true);

        return "livro";
    }
}

