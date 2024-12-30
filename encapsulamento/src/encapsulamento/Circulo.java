package encapsulamento;

/******************************************************************************
Crie um programa, utilizando o paradigma da Orientação a Objetos (OO), para receber o
valor do raio de um círculo. Em seguida, o programa deverá calcular a Área,
Circunferência e o Diâmetro com base no valor informado.
*******************************************************************************/
public class Circulo {
    
    private double raio;
    private double pi = Math.PI;
    
    public Circulo() {
        
    }
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    
    public double calcArea() {
        return (pi * (raio * raio));
    }
    
    public double calcPerimetro() {
        return ( 2 * pi * raio);
    }
    
    public double calcDiametro() {
        return ( 2 * raio);
    }
    
}