import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE PRECIOS");
        Main main = new Main();
        double precio = main.readPrecio();
        System.out.println("El producto con precio " + precio + " le queda con IVA : " + main.getPrecioTotal(precio));

    }

    public double readPrecio() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        return scn.nextDouble();
    }

    public double getPrecioTotal(double precio) {
        final double IVA = 0.21;
        return precio + (precio * IVA);
    }
}
