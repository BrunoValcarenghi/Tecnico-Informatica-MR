
package exercicio04;
import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
     
        System.out.println("Digite um numero");
        int x = teclado.nextInt();
        int multiplicacao = 1;
        for (int i = 1 ; i <= x ; i++ ){
            
            
            
       multiplicacao = multiplicacao * i;
    }
    System.out.println("A soma dos resultados é " + multiplicacao );
}}
    
    

