import javax.swing.*;
import java.util.Scanner;

public class Main {

/*
* COMENTARIO:
*   La verdad ponerle un switch como lo sugiere la pista lo veo como perdida de lineas de codigo
*   Ya que no tendria ninguna funcionalidad y los requerimientos que piden el ejercicio, con el simple ciclo
*   funciona.
*
* NOTA:
*   El mensaje del warning esta en un JOptionPane ya que lo quise asi por estetica.
*   Puede que no se superponga la primera vez
* */

    public static void main(String[] args) {
        Main main = new Main();
        main.options();
    }


    public void options() {
        Scanner scn = new Scanner(System.in);
        int option;
        do {
            menu();
            option = scn.nextInt();
            check(option);
        } while (option != 8);
    }

    public void check(int option) {
        if (option > 8)
            JOptionPane.showMessageDialog(null, "PRECAUCION!!, INGRESE UN NUMERO VALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
    }

    public void menu() {
        System.out.println("Gestion Cinematografica!\n" +
                "1. NUEVO ACTOR\n" +
                "2. BUSCAR ACTOR\n" +
                "3. ELIMINAR ACTOR\n" +
                "4. MODIFICAR ACTOR\n" +
                "5. VER TODOS LOS ACTORES\n" +
                "6. VER PELICULAS DE LOS ACTORES\n" +
                "7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8. SALIR");
    }
}

