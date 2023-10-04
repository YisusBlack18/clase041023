class Animal {
    public void mover() {
        System.out.println("Se mueve de forma genérica");
    }
}

class Perro extends Animal {
    @Override
    public void mover() {
        System.out.println("El perro corre y camina");
    }
}

class Pez extends Animal {
    @Override
    public void mover() {
        System.out.println("El pez nada");
    }
}

class Pajaro extends Animal {
    @Override
    public void mover() {
        System.out.println("El pájaro vuela");
    }
}

public class App {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Pez pez = new Pez();
        Pajaro pajaro = new Pajaro();
        
        System.out.print("Movimiento del perro: ");
        perro.mover();

        System.out.print("Movimiento del pez: ");
        pez.mover();

        System.out.print("Movimiento del pájaro: ");
        pajaro.mover();
    }
}
