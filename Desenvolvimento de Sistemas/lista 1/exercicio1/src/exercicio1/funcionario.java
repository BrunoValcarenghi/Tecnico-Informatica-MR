
package exercicio1;

public class funcionario extends cliente{
    
    public int salario, desconto;
    
    public funcionario(String n, String e, String m, String t, int s, int d){
    
    super(n, e, m, t);
    salario = s;
    desconto = d;
      
    }
    
    
}
