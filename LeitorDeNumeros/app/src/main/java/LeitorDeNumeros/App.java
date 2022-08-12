package LeitorDeNumeros;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantos numeros deseja inserir? ");
        int n = s.nextInt();
        //int x;
        
        for (int i = 1; i <= n; i++)
        {
            System.out.print("Insira o " + i + "° numero ");
            int x = s.nextInt();
            if (x > 0)
            {
                System.out.println("Numero positivo");
            } else if (x < 0)
            {
                System.out.println("Numero negativo");
            } else
            {
                System.out.println("Nulo");
            }
        }
        
    }
}
