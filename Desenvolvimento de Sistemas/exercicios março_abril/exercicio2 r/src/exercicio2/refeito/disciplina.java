
package exercicio2.refeito;




public class disciplina {
    
    String nome;
    int carga_horaria;
    
        public disciplina (String n, int ch) {
    
        nome = n ;
        carga_horaria = ch;
    
    }
    
    public void mostrar (){
    
        System.out.println( "a disciplina " + nome + " possui um total de " + carga_horaria + " periodos semanais por semana.");
        
    }
    
    
}
