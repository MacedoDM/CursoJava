package IngressoHeranca;

public class IngressoVIP extends Ingresso {
    private float taxaAdicional;

    public IngressoVIP() {
        super();
    }
    
    public float CalcularValor()
    {
        return (this.taxaAdicional + super.getValor()) * super.getQuantidade();
    }

    public float getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(float taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }  
}
