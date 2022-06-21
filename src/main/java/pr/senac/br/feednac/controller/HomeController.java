package pr.senac.br.feednac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String Home() {
        return "API - FEEDNAC v0.0.1";
    }
}
