import prova.Circulo;
import prova.Quadrado;
import prova.Retangulo;
import prova.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Quadrado quadrado = new Quadrado(null);
        quadrado.setCor("Roxo");
        quadrado.setLado1(4);

        Triangulo triangulo = new Triangulo("azul", 5, 12);
        Circulo circulo = new Circulo("verde", 10.2);
        Retangulo retangulo = new Retangulo(null, 0, 0, 0);

        System.out.println(quadrado);
        System.out.println("Base do quadrado: " + quadrado.getArea());

        System.out.println(triangulo);
        System.out.println("Base do quadrado: " + triangulo.getArea());

        System.out.println(circulo);
        System.out.println("Base do quadrado: " + circulo.getRaio());

        System.out.println(retangulo);
        System.out.println("Base do quadrado: " + retangulo.getArea());
    }
}
