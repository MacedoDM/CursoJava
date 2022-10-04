package AgendaPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Agenda a = new Agenda();
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Insira aqui quantas pessoas deseja adicionar: ");
        int n = s.nextInt();
        //String[] array = new String[n];
        //List<Agenda> list = new ArrayList<Agenda>();
        
        for (int i = 1; i<= n; i++)
        {
            System.out.print("Insira aqui o nome: ");
            a.setNome(s.next());
            System.out.print("Insira aqui a idade: ");
            a.setIdade(s.nextInt());
            System.out.print("Insira aqui a altura: ");
            a.setAltura(s.nextFloat());
            
            a.ArmazenarPessoa();
            
        }
        
        for (Agenda obj in list)
        {
            System.out.println(obj);
        }
    }
}
