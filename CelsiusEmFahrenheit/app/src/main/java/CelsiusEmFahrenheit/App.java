package CelsiusEmFahrenheit;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celsius: ");
        double tc = s.nextDouble();
        
        double tf = (9*tc+160)/5;
        System.out.print("A temperatura em Fahrenheit é de: " + tf);
        
    }
}
