
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {

        cliente p1 = new cliente("davi", "campestre", "davi77pns@gmail.com", "5555");
        funcionario p2 = new funcionario("pedro", "jk", "pedrovkv@gmail.com", "5599", 7, 10);
        
        System.out.println("O cliente " + p1.nome + " que mora em " + p1.endereço + ", atende pelo Email " + p1.email + " e pelo numero "  + p1.telefone + " esta com uma divida de 9889070890789678");
        System.out.println("O funcionario " + p2.nome + " que mora em " + p2.endereço + ", email " + p2.email + " e telefone " + p2.telefone + " recebe " + p2.salario + " reais de salario e recebe " + p2.desconto + "% de desconto");
    }
    
}
