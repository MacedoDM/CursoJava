package ContaDeLuz;

import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite aqui o tipo de seu estabelecimento");
        System.out.println("Digite 1 para tipo Residencial");
        System.out.println("Digite 2 para tipo Comercial");
        System.out.println("Digite 3 para tipo Industrial");
        int tipo = s.nextInt();
        System.out.print("Digite aqui a quantidade de horas consumidas: ");
        double hora = s.nextDouble();
                     
        if (tipo == 1)
        {
            double calculo = hora * 0.6;
            System.out.print("O valor de consumo foi: " + calculo);
        } else if (tipo == 2)
                {
                    double calculo = hora * 0.48;
                    System.out.print("O valor de consumo foi: " + calculo);
                } else if (tipo == 3)
                        {
                            double calculo = hora * 1.29;
                            System.out.print("O valor de consumo foi: " + calculo);
                        } else
                {
                    System.out.print("Tipo não encontrado");
                }
    }
    
}
