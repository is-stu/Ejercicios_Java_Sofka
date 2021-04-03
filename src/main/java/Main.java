import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.operation();

    }

    public int getNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        return scn.nextInt();
    }

    public void operation() {

        for (int number = getNumber(); number <= 1000; number += 2) {
            System.out.println("numero: " + number);
        }
    }
}

