package ContaCorrenteBanco;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ContaBancaria contaB = new ContaBancaria();
        /*ContaBancaria contaB = new ContaBancaria("João", 1234, 100.0f);
        System.out.println("A conta criada é: " + contaB.getConta() + ", no nome"
                + " do cliente: " + contaB.getNome() + " com saldo de R$ " + 
                contaB.getSaldo()); */
        
        System.out.print("Insira aqui o código da nova conta criada: ");
        contaB.setConta(s.nextInt());
        System.out.print("Insira aqui o nome do cliente: ");
        contaB.setNome(s.next());
        System.out.print("Insira aqui o saldo inicial do cliente (R$): ");
        contaB.setSaldo(s.nextFloat());
        
        System.out.println("O cliente deseja depositar em sua conta?");
        System.out.print("Digite S para sim ou N para não: ");
        char resp = s.next().charAt(0);
        
        if (resp == 'S' || resp == 's')
        {
            System.out.print("Digite aqui o valor a depositar (R$): ");
            double quantia = s.nextDouble();
            contaB.Depositar(quantia);
        } else
        {
            
        }
        System.out.println("O cliente deseja realizar um saque?");
        System.out.print("Digite S para sim ou N para não: ");
        char res = s.next().charAt(0);
        
        if (res == 'S' || res == 's')
        {
            System.out.print("Digite aqui o valor a sacar (R$): ");
            double quantia = s.nextDouble();
            contaB.Sacar(quantia);
        } else
        {
            
        }
        
        System.out.print("Agradecemos a preferência. Os dados do cliente são: "
                + "Nome: " + contaB.getNome() + ", Conta: " + contaB.getConta()
        + " E saldo: " + contaB.getSaldo());
        
        
        

   
    }
}
