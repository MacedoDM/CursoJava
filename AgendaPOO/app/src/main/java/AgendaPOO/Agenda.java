package AgendaPOO;

import java.util.ArrayList;

public class Agenda {
    private String nome;
    private int idade;
    private float altura;

    public Agenda() {
    }

    public Agenda(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public void ArmazenarPessoa()
    {
        Agenda i = new Agenda(nome, idade, altura);
        ArrayList<Agenda> people = new ArrayList<Agenda>();
        people.add(new Agenda(nome, idade, altura));
    }
    
    public void RemoverPessoa()
    {
        Agenda i = new Agenda(nome, idade, altura);
        ArrayList<Agenda> people = new ArrayList<Agenda>();
        people.remove(i);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
