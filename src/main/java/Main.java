import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.compare();

    }

    public String getWord() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        return scn.next();
    }

    public void compare() {
        String word1 = getWord();
        String word2 = getWord();


        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Las palabras " + word1 + " & " + word2 + " son iguales");
        }else{
            diff(word1,word2);
        }
    }

    public void diff(String word1, String word2){
        if(word1.length()!=word2.length()){
            System.out.println("Longitud no igual\n");
            System.out.println(word1+" tiene "+word1.length()+" de longitud");
            System.out.println(word2+" tiene "+word2.length()+" de longitud");
        }
        for (int i =0; i < word1.length(); i++){
            if(word1.charAt(i)!=word2.charAt(i)){
                System.out.println("Caracter diferente!");
                System.out.println("PALABRA1 : "+word1.charAt(i));
                System.out.println("PALABRA2 : "+word2.charAt(i));
            }
        }
    }
}
