package CarroPOO;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Carro c = new Carro();
        
        System.out.print("Insira aqui a quantidade de litros que deseja "
                + "abastecer: ");
        c.setGasolina(s.nextFloat());
        System.out.print("Insira aqui a distância em quilômetros percorrida: ");
        c.setDistancia(s.nextFloat());
        System.out.println("Relatório Final:");
        System.out.println("Distância total percorrida: " + c.getDistancia());
        System.out.println("Restam " + c.Consumo() + "L  de gasolina no tanque");
        
    }
}
