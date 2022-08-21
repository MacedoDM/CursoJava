package ElevadorPOO;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*Elevador e = new Elevador(0, 10, 850f, 12);
        System.out.print("As informações do elevador são: Andar atual: " +
                e.getAndar() + ", Andar máximo: " + e.getTotalAndares() +
                ", capacidade máxima: " + e.getCapacidade() + ", total de "
                        + "pessoas permitidas: " + e.getPessoas());*/
        
        Scanner s = new Scanner(System.in);
        Elevador e = new Elevador();
        System.out.print("Insira aqui a carga máxima do elevador: ");
        e.setCapacidade(s.nextFloat());
        System.out.print("Digite aqui o total de andares da torre: ");
        e.setTotalAndares(s.nextInt());
        new Elevador(0, e.getTotalAndares(), e.getCapacidade(), 0);
        
        System.out.println("As informações do elevador são: Andar atual: " +
                e.getAndar() + ", Andar máximo: " + e.getTotalAndares() +
                ", capacidade máxima: " + e.getCapacidade() + ", total de "
                        + "pessoas dentro do elevador: " + e.getPessoas());
        
        System.out.print("Insira aqui a quantidade máxima de pessoas que podem"
                + " utilizar o elevador ao mesmo tempo: ");
        int max = s.nextInt();
        System.out.println("Deseja adicionar mais pessoas ao elevador?");
        System.out.print("Caso Sim, tecle S. Caso Não, tecle N: ");
        char resp = s.next().charAt(0);
        
        if (resp == 's' || resp == 'S')
        {
            System.out.print("Digite a quantidade de pessoas que irá entrar: ");
            int quantidade = s.nextInt();
            e.Entrar(quantidade);
            
            while (e.getPessoas() > max)
            {
                System.out.println("Capacidade de pessoas máxima excedida!");
                System.out.print("Insira nova quantidade de pessoas que irá"
                        + " entrar no elevador: ");
                quantidade = s.nextInt();
                e.Entrar(quantidade);
            }
        }
        
        System.out.println("Deseja remover pessoas do elevador?");
        System.out.print("Caso Sim, tecle S. Caso Não, tecle N: ");
        char res = s.next().charAt(0);
        
        if (res == 's' || res == 'S')
        {
            System.out.print("Digite a quantidade de pessoas que irá sair: ");
            int quantidade = s.nextInt();
            e.Sair(quantidade);
            while (e.getPessoas() < 0)
            {
                System.out.println("O número de pessoas retiradas é impossível!");
                System.out.print("Insira nova quantidade de pessoas que irá"
                        + " sair no elevador: ");
                quantidade = s.nextInt();
                e.Sair(quantidade);
            }
        }
        
        System.out.println("Deseja ir subir com o elevador?");
        System.out.print("Caso Sim, tecle S. Caso Não, tecle N: ");
        char re = s.next().charAt(0);
        
        if (re == 's' || re == 'S')
        {
            System.out.print("Digite o novo andar que irá subir: ");
            int deslocamento = s.nextInt();
            e.Movimentar(deslocamento);
            while (e.getAndar() > e.getTotalAndares())
            {
                System.out.println("O elevador não pode subir até esse andar!");
                System.out.print("Insira o novo andar que irá subir: ");
                deslocamento = s.nextInt();
                e.Movimentar(deslocamento);
            }
        }
        System.out.println("Deseja ir descer com o elevador?");
        System.out.print("Caso Sim, tecle S. Caso Não, tecle N: ");
        char r = s.next().charAt(0);
        
        if (r == 's' || r == 'S')
        {
            System.out.print("Digite o novo andar que irá descer: ");
            int deslocamento = s.nextInt();
            e.Movimentar(deslocamento);
            while (e.getAndar() < 0)
            {
                System.out.println("O elevador não pode descer até esse andar!");
                System.out.print("Insira o novo andar que irá descer: ");
                deslocamento = s.nextInt();
                e.Movimentar(deslocamento);
            }
        }
        
    }
}
