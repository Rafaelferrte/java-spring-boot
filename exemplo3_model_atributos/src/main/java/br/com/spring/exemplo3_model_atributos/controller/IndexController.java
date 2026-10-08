package br.com.spring.exemplo3_model_atributos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/usu")
    public String Usuario(Model model){
        model.addAttribute("login","rafael");
        model.addAttribute("senha", 1234);
        model.addAttribute("telefone","(13)99999-9999");
        return "usu";
    }
}
