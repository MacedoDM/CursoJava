package TrocaDeValores;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o valor da variavel A");
        int A = s.nextInt();
        System.out.println("Insira o valor da variavel B");
        int B = s.nextInt();
        
                
        System.out.println("O valor da variavel A foi trocado com a variavel B!");
        System.out.println("O valor da variavel A é " + A);
        System.out.println("O valor da variavel B é " + B);
    }
}
