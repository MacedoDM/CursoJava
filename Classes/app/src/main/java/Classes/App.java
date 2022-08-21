package Classes;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa objetoPessoa = new Pessoa();
        //Pessoa objetoPessoa = new Pessoa(70.0f, 1.71f);
        
        
        System.out.println("Digite as informações necessárias:");
        System.out.print("Digite aqui o peso em kg: ");
        objetoPessoa.setPeso(s.nextFloat());
        
        System.out.print("Digite aqui a altura em metros: ");
        objetoPessoa.setAltura(s.nextFloat());
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
