package CalculoIdadePOO;


public class Pessoa {
    private String nome;
    private int dataNascimento;
    private float altura;
    
    public Pessoa()
    {
        
    }
    
    public int CalcularIdade()
    {
        int idade = 2022 - dataNascimento;
        return idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
