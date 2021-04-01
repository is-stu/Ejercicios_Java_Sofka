import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Encuentra el area del circulo!");
        Main main = new Main();
        double radio = main.readRadio();
        System.out.println("El area del circulo es: " + main.getArea(radio));

    }

    public double readRadio() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        return scn.nextInt();
    }

    public double getArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
