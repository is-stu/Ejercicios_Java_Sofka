import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showAns();
    }

    public String requestDay() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: (todo en minusculas)");
        return scn.next();
    }

    public String isAvailable() {
        String day = requestDay();
        switch (day) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                return "Es un dia laboral";
            case "sabado":
            case "domingo":
                return "Es un dia festivo";
            default:
                return "Dia invalido";
        }
    }

    public void showAns() {
        System.out.println(isAvailable());
    }

}
