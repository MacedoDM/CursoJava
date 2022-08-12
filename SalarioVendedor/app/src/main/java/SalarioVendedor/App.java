package SalarioVendedor;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario");
        String nome = s.next();
        System.out.println("Digite o salario fixo de " + nome + " em reais");
        double salario = s.nextDouble();
        System.out.println("Digite o valor total em vendas que " + nome + " realizou nesse mes");
        double vendas = s.nextDouble();
        
        double salarioFinal = salario + vendas * 0.15;
        
        System.out.println("O salario final de " + nome + " sera de R$ " + salarioFinal);
        
        
        
        
    }
}
