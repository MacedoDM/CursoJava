package CategoriaNadador;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite aqui a idade do atleta: ");
        int idade = s.nextInt();
        
        if (idade >= 5 && idade <= 7)
        {
            System.out.print("Atleta Infantil A");
        } else if (idade >= 8 && idade <= 10)
        {
            System.out.print("Atleta Infantil B");
        } else if (idade >= 11 && idade <= 13)
        {
            System.out.print("Atleta Juvenil A");
        } else if (idade >= 14 && idade <= 17)
        {
            System.out.print("Atleta Juvenil B");
        } else if (idade >= 18 && idade <= 25)
        {
            System.out.print("Atleta Senior");
        } else
        {
            System.out.print("Atleta fora da faixa etaria");
        }
    }
}
