import java.util.Scanner;

public class Main {

    String text = "La sonrisa sera la mejor arma contra la tristeza";

    public static void main(String[] args) {
        Main main = new Main();
        main.show();
    }

    public String readConca(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese lo que quiere concatenar a esta frase\n { "+text+" }");
        return scn.nextLine();
    }

    public void show(){
        String textMod = text.replace('a','e');
        String textModConca = textMod + " " + readConca();
        System.out.println("Original:\n { "+text+" }");
        System.out.println("Modificada:\n { "+textMod+" }");
        System.out.println("Modificada & Concatenada:\n { "+textModConca+" }");
    }

}
