package PostoDeGasolina;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Bem vindo ao posto, tecle o codigo do produto desejado");
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        int n = s.nextInt();
        
        while(n != 4)
        {
            if (n == 1)
            {
                System.out.println("Alcool");
                alcool = alcool + 1;        
            } else if (n == 2)
            {
                System.out.println("Gasolina");
                gasolina = gasolina + 1;
                
            } else if (n == 3)
            {
                System.out.println("Diesel");
                diesel = diesel + 1;
            }
            n = s.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Total de Alcool: " + alcool);
        System.out.println("Total de Gasolina: " + gasolina);
        System.out.println("Total de Diesel: " + diesel);
        
    }
}
