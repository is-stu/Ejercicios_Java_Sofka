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
        int i = 1;
        while (i <= 100) {
            if (isEven(i))
                System.out.println(i + " Es par");
            i++;
        }
    }

    public void impares() {
        int i = 1;
        while (i <= 100) {
            if (!isEven(i))
                System.out.println(i + " Es impar");
            i++;
        }
    }

}
