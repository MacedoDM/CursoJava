package ServicoMilitar;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira aqui os dados:");
        System.out.print("Insira o nome: ");
        String nome = s.next();
        System.out.print("Insira aqui o sexo (H/M): ");
        char sexo = s.next().charAt(0);
        System.out.print("Insira aqui a idade: ");
        int idade = s.nextInt();
        System.out.println("Insira aqui o estado de saude");
        System.out.print("S para Saudavel ou N para Nao Saudavel: ");
        char saude = s.next().charAt(0);
        
        if(sexo == 'H' && idade >=18 && saude == 'S')
        {
            System.out.println("O Sr " + nome + ", de " + idade + " anos, esta apto para servir");
        } else
        {
            System.out.println("O cidadao nao esta apto para servir");
        }
        
    }
}
