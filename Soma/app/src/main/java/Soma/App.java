package Soma;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Entre o primeiro numero");
        double n1 = s.nextDouble();
        System.out.println("Entre o segundo numero");
        double n2 = s.nextDouble();
        
        double soma = n1 + n2;
        
        System.out.println("O resultado da soma é: " + soma);
        
    }
}
