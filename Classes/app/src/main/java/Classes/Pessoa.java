package Classes;

public class Pessoa {
    
    //Atributos
    private float peso;
    private float altura;
    
    //Metodo construtor
    /*O metodo construtor é executado na entidade principal com o comando
    Pessoa objetoPessoa = new Pessoa().
    É utilizado quando se quer implementar valores default no programa*/
    public Pessoa()
    {
        System.out.println("Executando o método construtor");
    }
    
    //Metodo construtor
    /*O caso abaixo é feito para iniciar valores default no programa
    É importante se atentar à palavra "this." pois, sem a existencia da mesma
    o programa não saberá qual Peso é o atributo e qual é o parâmetro. Ao incluir
    a palavra "this.", é indicada a referência ao atributo, estabelecido no
    inicio do código dessa classe.*/
    
    /*public Pessoa(float peso, float altura)
    {
        this.peso = peso;
        this.altura = altura;
    }*/

    //Metodos
    public float calcularIMC()
    {
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //Metodos acessores
    //Esses métodos servem para que os atributos da classe sejam acessados por
    //outras entidades
    
    public void setPeso(float peso)
    {
        this.peso = peso;
    }
    
    public float getPeso()
    {
        return peso;
    }
    
    public void setAltura(float altura  )
    {
        this.altura = altura;
    }
    
    public float getAltura()
    {
        return altura;
    }
    
    /* Os atributos Peso e Altura são privados, isso é feito para garantir a
    segurança dos dados e apenas a classe Pessoa poderá modificar esses atributos,
    ou seja, em nenhuma outra parte do código esses atributos serão modificados.
    Com isso, é necessário a implementação do SET e GET que possuem as seguintes
    características: O SET tem como objetivo modificar o atributo selecionado,
    ou seja, a entidade externa solicitara a classe Pessoa para modificar o
    atributo desejado e o atributo será modificado pela classe Pessoa. O GET tem
    como objetivo retornar para a entidade externa o valor de algum atributo.*/
}
