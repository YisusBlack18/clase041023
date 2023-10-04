class Fruta {
    public String obtenerColor() {
        return "Desconocido";
    }
}

class Manzana extends Fruta {
    @Override
    public String obtenerColor() {
        return "Rojo"; 
    }
}

class Banana extends Fruta {
    
    @Override
    public String obtenerColor() {
        return "Amarillo";
    }
}

public class App {
    public static void main(String[] args) {
        Fruta fruta;

        fruta = new Manzana();
        
        System.out.println("Color de la manzana: " + fruta.obtenerColor());

        fruta = new Banana();
        
        System.out.println("Color de la banana: " + fruta.obtenerColor());
    }
}
