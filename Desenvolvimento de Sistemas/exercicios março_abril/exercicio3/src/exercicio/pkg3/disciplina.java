
package exercicio.pkg3;

public class disciplina {
    
    private String nome;
    private int carga_horaria;
    
        public disciplina () {
    
        nome = "desenvolvimento de sistemas" ;
        carga_horaria = 3;
    
    }
    
    public String Retornar (){
    
        return nome + " " + carga_horaria;
    }
    
    
}