package Heranca;

/* Na Herança, todos os atributos do vendedor com o funcionario serão aproveitados
na classe Funcionario e os atributos particulares do vendedor serão feitos aqui.
Com isso, é adicionado o termo "extends Funcionario" logo ao lado da classe e,
no método do Vendedor, é adicionado o termo "super();".
*/
public class Vendedor extends Funcionario {
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor()
    {
     super();   
    }
    
    /* Há uma hierarquia nesse método e, para acessar um atributo na outra classe
    superior é preciso utilizar a palavra "super"
    
    */
    public float calcularSalario()
    {
        return super.getSalario() + (this.comissaoPorItem * this.totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
}
