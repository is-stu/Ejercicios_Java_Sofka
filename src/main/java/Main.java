
public class Main {

    public static void main(String[] args) {
    //CREACION DE ARRAYS Y LECTURA DE DATOS --------------------------------------------------------------
        Serie series[] = new Serie[5];
        Videojuego videojuegos[] = new Videojuego[5];

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Fortnite", 200, "Battle Royal", "Epic Games");
        videojuegos[2] = new Videojuego("Rainbow Six", 400);
        videojuegos[3] = new Videojuego("Rocket League", 50, "EveryOne", "Nintendo");
        videojuegos[4] = new Videojuego("Final fantasy X", 150, "Rol", "Square Enix");

        series[0] = new Serie();
        series[1] = new Serie("Juego de tronos", "George R. R. Martin ");
        series[2] = new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        series[3] = new Serie("Black Mirror", 5, "Ciencia Ficcion", "Charlie Brooker");
        series[4] = new Serie("Breaking Bad", 4, "Thriller", "Vince Gilligan");
    //Rellenando campos del videojuego 2
        videojuegos[2].setGenero("Shooter");
        videojuegos[2].setCompania("Ubisoft");
    //ENTREGAR Y DEVOLVER VIDEOJUEGOS Y SERIES ------------------------------------------------------------
        series[2].entregar();
        series[3].entregar();
        videojuegos[1].entregar();
        videojuegos[4].entregar();

        int entregados = 0;

        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                entregados += 1;
                series[i].devolver();

            }
            if (videojuegos[i].isEntregado()) {
                entregados += 1;
                videojuegos[i].devolver();
            }
        }

        System.out.println("Hay " + entregados + " articulos entregados");
    // SABER CUAL ES EL MAYOR DE CADA UNO -------------------------------------------------------
        Serie serieMayor = series[0];
        Videojuego videojuegoMayor = videojuegos[0];


        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(serieMayor) == Serie.MAYOR) {
                serieMayor = series[i];
            }
            if (videojuegos[i].compareTo(videojuegoMayor) == Videojuego.MAYOR) {
                videojuegoMayor = videojuegos[i];
            }

        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }

}


