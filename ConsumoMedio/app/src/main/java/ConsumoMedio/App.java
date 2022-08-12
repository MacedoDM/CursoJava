package ConsumoMedio;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a distancia total percorrida pelo automovel em Km");
        double distancia = s.nextDouble();
        System.out.println("Insira o total de combustivel gasto em L ");
        double combustivel = s.nextDouble();
        
        double consumo = distancia/combustivel;
        
        System.out.println("O consumo medio foi de " + consumo + " Km/L");
    }
}
