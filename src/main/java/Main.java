import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.readNumber();
    }

    public void readNumber() {
        int number;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero mayor o igual que 0");
            number = scn.nextInt();
        } while (number < 0);
        message(number);
    }

    public void message(int number) {
        System.out.println("El numero ingresado fue: " + number);
    }
}
