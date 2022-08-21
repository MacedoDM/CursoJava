package ElevadorPOO;

public class Elevador {

    private int andar; //andar atual do elevador
    private int totalAndares; //total de andares que o elevador percorre
    private float capacidade; // capacidade máxima do elevador em kg
    private int pessoas; //quantidade de pessoas dentro do elevador

    public Elevador() {
    }

    public Elevador(int andar, int totalAndares, float capacidade, int pessoas) {
        this.andar = andar;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
    }

    public int Entrar(int quantidade) {
        return pessoas + quantidade;        
    }

    public int Sair(int quantidade) {
        return pessoas - quantidade;
    }
    
    public int Movimentar(int deslocamento)
    {
        return this.andar = deslocamento;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

}
