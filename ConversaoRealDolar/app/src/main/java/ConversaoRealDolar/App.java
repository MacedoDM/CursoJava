package ConversaoRealDolar;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Insira aqui o valor da cotação do dólar: ");
        double cotacao = s.nextDouble();
        System.out.print("Insira o valor em reais que deseja trocar: ");
        double reais = s.nextDouble();
        
        double dolar = reais/cotacao;
        
        System.out.print("O senhor recebera " + dolar + " dolares");
    }
}
