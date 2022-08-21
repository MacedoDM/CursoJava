package Heranca;

import java.util.Date;

/* O problema que a Herança busca solicionar é um problema de repetição
Aqui é visto um software que busca criar uma folha de pagamentos de uma empresa
Essa empresa, a depender do porte, pode ter de um a milhares de funcionarios
Cada funcionario empregado teria uma classe com os mesmos atributos, isto é,
nome, cpf, data de nascimento e salario (nesse caso), criando um problema de
software muito grande, pesado e trabalhoso de se executar. Com isso, a herança
busca resolver esse problema. Para isso, foi criada uma nova classe chamada
funcionario.
*/

public class App {
    
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Matheus");
        v.setSalario(10000.0f);
        v.setCpf("5632785632");
        v.setDataNascimento(new Date());
        v.setTotalItensVendidos(10);
        v.setComissaoPorItem(10.0f);
        
        System.out.println("O salário do vendedor é " + v.calcularSalario());
    }
}
