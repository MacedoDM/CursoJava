package NotaPOO;

public class Aluno {
    private String nome;
    private int matricula;
    private float prova1;
    private float prova2;
    private float trabalho;

    public Aluno() {
    }
    
    public float Media()
    {
        return (float) (((prova1*2.5)+(prova2*2.5)+(trabalho*2))/7);
    }
    
    public float Final()
    {
        if (Media() >= 6)
        {
            System.out.print("Aluno aprovado, Parabéns! ");
            return 0;
            
        } else 
        {
            System.out.print("Aluno reprovado ");
            return Media();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }
    
    
}
