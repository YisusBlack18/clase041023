class Figura {
    public double calcularArea() {
        return 0.0;
    }
}

class Rentangulo extends Figura {
    private double base;
    private double altura;

    public Rentangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

public class App {
    public static void main(String[] args) {
        Figura figura = new Figura();

        System.out.println("Área de la figura: " + figura.calcularArea());

        Rentangulo rentangulo = new Rentangulo(5.0, 10.0);

        System.out.println("Área del rentángulo: " + rentangulo.calcularArea());

        Circulo circulo = new Circulo(5.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
