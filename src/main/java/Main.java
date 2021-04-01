import java.util.Scanner;

public class Main {
    int number1, number2;
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.readNumbers();
        main.bigger();
    }

    public void readNumbers() {
        System.out.println("Ingrese el primer numero: ");
        number1 = scn.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        number2 = scn.nextInt();
    }


    public void bigger() {
        if (number1 > number2) {
            System.out.println("El numero " + number1 + " es mayor que " + number2);
        } else if (number2 > number1) {
            System.out.println("El numero " + number2 + " es mayor que " + number1);
        } else {
            System.out.println("El numero " + number1 + " es igual que el numero " + number2);
        }
    }
}
