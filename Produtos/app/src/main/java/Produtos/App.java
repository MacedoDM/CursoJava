package Produtos;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float diferenca;
        
        System.out.print("Digite aqui a quantidade de produtos que deseja consultar: ");
        int n = s.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            System.out.print("Digite o nome do produto: ");
            nomeProduto = s.next();
            System.out.print("Digite aqui o preco de compra do produto: ");
            precoCusto = s.nextFloat();
            System.out.print("Digite aqui o preco de venda do produto: ");
            precoVenda = s.nextFloat();
            
            if (precoCusto > precoVenda)
            {
                diferenca = precoCusto - precoVenda;
                System.out.println("Houve prejuízo na venda do produto " + nomeProduto + " de R$ " + diferenca);
            } else if (precoCusto < precoVenda)
            {
                diferenca = precoVenda - precoCusto;
                System.out.println("Houve lucro na venda do produto " + nomeProduto + " de R$ " + diferenca);
            } else
            {
                System.out.println("Nao houve lucro ou prejuizo na venda do produto " + nomeProduto);
            }   
            
        }
    }
}
