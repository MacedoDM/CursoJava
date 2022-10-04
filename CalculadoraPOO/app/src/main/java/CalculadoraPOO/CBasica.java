package CalculadoraPOO;

public class CBasica {
    private float n1;
    private float n2;
    private char operator;
    private float answer;

    public CBasica() {
    }
    
    public float Calcular()
    {
        switch (operator)
        {
            case '+': answer = n1 + n2;
            break;
            case '-': answer = n1 - n2;
            break;
            case '*': answer = n1 * n2;
            break;
            case '/': answer = n1 / n2;
            break;
        }
        return answer;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    } 
}
