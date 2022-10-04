package JogadoresDeFutebolPOO;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Jogador j = new Jogador();
        System.out.print("Insira aqui o nome do jogador: ");
        j.setNome(s.next());
        System.out.print("Insira aqui o ano de nascimento do jogador: ");
        j.setDataNascimento(s.nextInt());
        System.out.print("Insira aqui a nacionalidade do jogador: ");
        j.setNacionalidade(s.next());
        System.out.print("Insira aqui a altura em metros do jogador: ");
        j.setAltura(s.nextFloat());
        System.out.print("Insira aqui o peso em quilogramas do jogador: ");
        j.setPeso(s.nextFloat());
        System.out.println("Insira aqui a posição de atuação do jogador:");
        System.out.println("Para goleiro ou defensor, escreva D;");
        System.out.println("Para volante ou meio campista, escreva M;");
        System.out.println("Para atacante ou pontas, escreva A;");
        j.setPosicao(s.next().charAt(0));
        
        System.out.println("Dados do jogador:");
        System.out.println("Nome: " + j.getNome() + ", Nacionalidade: " +
         j.getNacionalidade() + ", Peso: " + j.getPeso() + "kg, Altura: " +
                j.getAltura() + "m, Posição: " + j.getPosicao() +
                ", Idade: " + j.CalcularIdade() + " anos, e se aposentará em " +
                j.Aposentar() + "anos.");
    }
        
        
}
