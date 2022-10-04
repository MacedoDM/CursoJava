package JogadoresDeFutebolPOO;

public class Jogador {
    
    private String nome;
    private char posicao;
    private int dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public Jogador() {
    }
    
    public int CalcularIdade()
    {
        return 2022 - dataNascimento;
    }
    
    public int Aposentar()
    {
        if(posicao == 'D' || posicao == 'd')
        {
            return 40 - CalcularIdade();
        } else if (posicao == 'M' || posicao == 'm')
        {
            return 38 - CalcularIdade();
        } else if (posicao == 'A' || posicao == 'a')
        {
            return 35 - CalcularIdade();
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
