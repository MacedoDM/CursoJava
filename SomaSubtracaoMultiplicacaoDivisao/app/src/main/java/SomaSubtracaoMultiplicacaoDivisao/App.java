package SomaSubtracaoMultiplicacaoDivisao;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero");
        double n1 = s.nextDouble();
        System.out.println("Escreva o segundo numero");
        double n2 = s.nextDouble();
        
        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;
        
        System.out.println("A soma dos numeros: " + soma);
        System.out.println("A subtracao dos numeros: " + subtracao);
        System.out.println("A multiplicacao dos numeros: " + multiplicacao);
        System.out.println("A divisao dos numeros: " + divisao);
    }
}
