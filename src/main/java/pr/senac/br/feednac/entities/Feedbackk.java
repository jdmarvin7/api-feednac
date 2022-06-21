package pr.senac.br.feednac.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Feedbackk {  
    private Long id;
    private String titulo;
    private String feedback;
    private String autor;
    private Tipo tipo; 
}
