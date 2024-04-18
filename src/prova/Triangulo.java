package prova;

public class Triangulo extends Figura implements IComum {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public String getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

}