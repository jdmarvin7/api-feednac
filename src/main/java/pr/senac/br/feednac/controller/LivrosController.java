package pr.senac.br.feednac.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pr.senac.br.feednac.entities.Categoria;
import pr.senac.br.feednac.entities.Livro;
import pr.senac.br.feednac.entities.Modelo;

@Controller
public class LivrosController {
    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar() {
        Livro livro = new Livro(123L, "Controller - Spring", 1, "Vitor", Categoria.INFORMATICA, Modelo.EBOOK);

		return Arrays.asList(livro, livro, livro);
    }
}
