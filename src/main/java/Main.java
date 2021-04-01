import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("NUMEROS PARES E IMPARES DEL 1 AL 100");
        Main main = new Main();
        main.pares();
        main.impares();
    }

    public boolean isEven(int i) {
        return i % 2 == 0;
    }

    public void pares() {
        for (int i = 1; i <= 100; i++) {
            if (isEven(i))
                System.out.println(i + " Es par");
        }

    }

    public void impares() {
        for (int i = 1; i <= 100; i++) {
            if (!isEven(i))
                System.out.println(i + " Es impar");
        }
    }

}
