package LojaInformatica;

public class App {

    public static void main(String[] args) {
        Invoice inv = new Invoice(1, "Mousepad", 50, 10.0f);
        System.out.println("O preço total é: " + inv.getInvoiceAmount());
    }
}
