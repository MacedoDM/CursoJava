package IngressoHeranca;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ingresso i = new Ingresso();
        IngressoVIP iv = new IngressoVIP();
        
        System.out.print("Insira aqui o valor do ingresso em reais: ");
        iv.setValor(s.nextFloat());
        System.out.print("Insira aqui a taxa adicional do ingresso VIP em reais: ");
        iv.setTaxaAdicional(s.nextFloat());
        System.out.print("Insira aqui a quantidade de ingressos a comprar: ");
        iv.setQuantidade(s.nextInt());
        
        System.out.println("Resumo da transação:");
        System.out.print("Quantidade de ingressos: " + iv.getQuantidade() +
                " Taxa adicional dos ingressos: R$" + iv.getTaxaAdicional() +
                " Valor dos ingressos individuais: R$" + iv.getValor() +
                " Total da compra de ingressos: R$" + i.CalcularTotal() +
                " Total da compra de ingressos VIP's: R$" + iv.CalcularValor());
        
        
        
        
        
    }
}
