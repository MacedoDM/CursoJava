package NotaAluno;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = s.next();
        System.out.println("Insira a primeira nota do aluno " + nome);
        Double nota1 = s.nextDouble();
        System.out.println("Insira a segunda nota do aluno " + nome);
        Double nota2 = s.nextDouble();
        System.out.println("Insira a terceira nota do aluno " + nome);
        Double nota3 = s.nextDouble();
        
        Double media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7)
        {
            System.out.println("Aluno aprovado");
        } else
        {
            System.out.println("Aluno reprovado");
        }
        
        System.out.println("Media final do aluno " + media);
    }
}
