package IngressoHeranca;

public class Ingresso {
    private float valor;
    private int quantidade;

    public Ingresso() {
    }
    
    public float CalcularTotal()
    {
        return this.valor * this.quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
