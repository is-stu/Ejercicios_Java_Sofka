import java.util.Scanner;

public class Main {

    String text = "La sonrisa sera la mejor arma contra la tristeza";

    public static void main(String[] args) {
        Main main = new Main();
        main.clean();
    }

    public String readPhrase(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        return scn.nextLine();
    }

    public void clean(){
        String phrase = readPhrase();
        String phraseMod = phrase.replace(" ","");
        System.out.println("Original:\n { "+phrase+" }");
        System.out.println("Sin espacios:\n { "+phraseMod+" }");
    }

}
