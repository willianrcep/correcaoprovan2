package prova;

public class Circulo extends Figura implements IComum {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public void area() {
        System.out.println(getRaio());
    }

}
