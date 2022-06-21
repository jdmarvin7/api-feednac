package pr.senac.br.feednac.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Livro {
    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;
    private Categoria categoria;
    private Modelo modelo;
}
