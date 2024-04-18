package prova;

public class Triangulo extends Figura implements Icomum {
    
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
    public Triangulo(){
        super();
    }
     @Override
     public String toString(){
        return "Triangulo [base=" + base + ", altura="+altura+",cor ="+super.getCor()+"]";
     }
    @Override
    public double getArea() {
        
        return base*altura;
    }
}
