package Senha;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite aqui a senha para o acesso: ");
        
        int senha = s.nextInt();
        
        while (senha != 2002)
        {
            System.out.print("Senha incorreta, tente novamente: ");
            senha = s.nextInt();
        }
        
        System.out.println("Senha correta, bem vindo");
        
    }
}
