package FuncionariosPOO;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Funcionarios f = new Funcionarios();
        
        System.out.print("Insira aqui o nome do funcionário: ");
        f.setNome(s.next());
        System.out.print("Insira aqui o sobrenome do funcionário: ");
        f.setSobrenome(s.next());
        System.out.print("Insira aqui o salário mensal do funcionário (R$): ");
        f.setSalario(s.nextFloat());
        
        System.out.println("Os dados do funcionário são: Nome: " + f.getNome() +
                ", sobrenome: " + f.getSobrenome() + ", com o salário mensal de: "
                        + f.getSalario());
        
        System.out.println("O funcionário receberá um reajuste?");
        System.out.print("Digite S para sim ou N para não: ");
        char resp = s.next().charAt(0);
        
        if (resp == 'S' || resp == 's')
        {
            System.out.print("Insira aqui a porcentagem de reajuste: ");
            float porcentagem = s.nextFloat();
            
            System.out.println("Os dados do funcionário são: Nome: " + f.getNome() +
                ", sobrenome: " + f.getSobrenome() + ", com o salário anual de: "
                        + f.Reajuste(porcentagem));
        } else
        {
            System.out.println("Os dados do funcionário são: Nome: " + f.getNome() +
                ", sobrenome: " + f.getSobrenome() + ", com o salário anual de: "
                        + f.SalarioAnual());
        }
        
    }
}
