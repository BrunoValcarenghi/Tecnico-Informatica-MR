package vet_dos_guri;
import java.util.Scanner;


public class Animal {
    
    private Scanner teclado = new Scanner(System.in);

    private String nome;
    private String especie;
    private String raça;
    private String porte;
    private float peso;
    private String pelagem;
    private int ano_nascimento;
    private int registro_dono;
    
    public Animal () {
        
        System.out.println("digite o nome do animal");
        nome = teclado.nextLine();
        
        System.out.println("digite a especie do " + nome);
        especie = teclado.nextLine();
        
        System.out.println("digite a raça do " + nome);
        raça = teclado.nextLine();
        
        System.out.println("digite o prote do " + nome);
        porte = teclado.nextLine();
        
        System.out.println("digite o peso do " + nome);
        peso = teclado.nextFloat();
        
        System.out.println("digite o ano de nascimento do " + nome);
        ano_nascimento = teclado.nextInt();

    }
    
    public String r_raça (){
    
        return "A raça do " + nome + " é:" + raça;
    }
    
    public String r_idade (){
    
        return "A idade do " + nome + " é:" + -(ano_nascimento - 2023);
    }
    
}
