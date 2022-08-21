package FuncionariosPOO;

public class Funcionarios {
    private String nome;
    private String sobrenome;
    private float salario;

    public Funcionarios() {
    }
    
    public float SalarioAnual()
    {
        return salario * 12;
    }
    
    public float Reajuste(float porcentagem)
    {
        return (salario + (salario * porcentagem/100)) * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {        
        if (salario < 0)
        {
            this.salario = 0;
        } else
        {
            this.salario = salario;
        }
        
    }
   
}
