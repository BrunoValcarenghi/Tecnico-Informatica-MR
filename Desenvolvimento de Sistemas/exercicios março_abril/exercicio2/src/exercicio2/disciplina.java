
package exercicio2;




public class disciplina {
    
    String nome;
    int carga_horaria;
    
        public disciplina () {
    
        nome = "desenvolvimento de sistemas" ;
        carga_horaria = 3;
    
    }
    
    public void mostrar (){
    
        System.out.println( "a disciplina " + nome + " possui um total de " + carga_horaria + " periodos semanais por semana.");
        
    }
    
    
}
