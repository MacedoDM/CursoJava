package ContaCorrenteBanco;

public class ContaBancaria {
    private String nome;
    private int conta;
    private float saldo;

    public ContaBancaria(String nome, int conta, float saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float Depositar(double quantia)
    {
        this.saldo+= quantia;
        return this.saldo;
    }
    
    public float Sacar(double quantia)
    {
        this.saldo-= quantia;
        return this.saldo;
    }
    
}
