package NotaPOO;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.print("Insira aqui a matricula do aluno: ");
        a.setMatricula(s.nextInt());
        System.out.print("Insira aqui o nome do aluno: ");
        a.setNome(s.next());
        System.out.print("Insira aqui a nota da primeira prova: ");
        a.setProva1(s.nextFloat());
        System.out.print("Insira aqui a nota da segunda prova: ");
        a.setProva2(s.nextFloat());
        System.out.print("Insira aqui a nota do trabalho: ");
        a.setTrabalho(s.nextFloat());
        
        a.Media();
        a.Final();
        
        
    }
}
