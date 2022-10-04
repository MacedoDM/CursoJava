package CarroPOO;

public class Carro {
    private float gasolina;
    private float distancia;

    public Carro() {
    }
    
    public float Consumo()
    {
        return gasolina - (distancia / 15);
    }

    public float getGasolina() {
        return gasolina;
    }

    public void setGasolina(float gasolina) {
        if (gasolina >= 50)
        {
            this.gasolina = 50;
        } else
        {
            this.gasolina = gasolina;            
        }
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
}
