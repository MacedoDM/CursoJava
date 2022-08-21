package CalculoIdadePOO;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa();
        
        System.out.print("Digite aqui o nome do cidadão: ");
        objetoPessoa.setNome(s.next());
        System.out.print("Digite aqui a altura de " + objetoPessoa.getNome() +
                " em metros: ");
        objetoPessoa.setAltura(s.nextFloat());
        System.out.print("Digite aqui o ano de nascimento de " +
                objetoPessoa.getNome() + ": ");
        objetoPessoa.setDataNascimento(s.nextInt());
        
        System.out.println("A idade de " + objetoPessoa.getNome() + " é de " +
        objetoPessoa.CalcularIdade());
        
    }
}
