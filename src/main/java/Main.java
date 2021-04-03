import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.answers();

    }

    public String read() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese la palabra o frase:");
        return scn.nextLine();
    }

    public void answers() {
        String phrase = read();
        System.out.println("La longitud de la cadena es de: "+ phrase.length());
        counterVocals(phrase);

    }

    public void counterVocals(String phrase) {
        int counterA=0;
        int counterE=0;
        int counterI=0;
        int counterO=0;
        int counterU=0;
        for (int i = 0; i < phrase.length(); i++) {
            switch(phrase.charAt(i)){
                case 'a':
                    counterA++;
                    break;
                case 'e':
                    counterE++;
                    break;
                case 'i':
                    counterI++;
                    break;
                case 'o':
                    counterO++;
                    break;
                case 'u':
                    counterU++;
                    break;

            }
        }
        System.out.println("Total de A : "+counterA);
        System.out.println("Total de E : "+counterE);
        System.out.println("Total de I : "+counterI);
        System.out.println("Total de O : "+counterO);
        System.out.println("Total de U : "+counterU);
    }
}
