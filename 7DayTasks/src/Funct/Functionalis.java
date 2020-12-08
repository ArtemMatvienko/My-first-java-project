package Funct;

public class Functionalis {
    public static void main(String[] args) {
        Chevrolet chevrolet = new Chevrolet();
        Lada lada = new Lada();
        lada.gas();
        chevrolet.gas();
    }

    public interface Car {
        default void gas() {
            System.out.println("Газ");
        } ;
    }

    public interface Plane {
          void gas();
    }

    public static class Chevrolet implements Car {

    }

    public static class Lada implements Car{

    }
}
