public class Main {
    public static void main(String[] args) {
        int number1 = 1, number2 = 10;
        Main main = new Main();
        main.bigger(number1,number2);
    }

    public void bigger(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("El numero " + number1 + " es mayor que " + number2);
        } else if (number2 > number1) {
            System.out.println("El numero " + number2 + " es mayor que " + number1);
        } else {
            System.out.println("El numero " + number1 + " es igual que el numero " + number2);
        }
    }
}
