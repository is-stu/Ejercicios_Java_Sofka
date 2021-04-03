import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        int edad, peso;
        double altura;
        char genero;
        Scanner scn = new Scanner(System.in);

        //LEER DATOS

        System.out.println("Ingrese su nombre");
        nombre = scn.nextLine();
        System.out.println("Ingrese su edad");
        edad = scn.nextInt();
        System.out.println("Ingrese su genero / H para hombre / M para mujer");
        genero = scn.next().charAt(0);
        System.out.println("Ingrese su peso en kg (68)");
        peso = scn.nextInt();
        System.out.println("Ingrese su altura en metros (1.80)");
        altura = scn.nextDouble();

        //CREACION DE OBJETOS

        Persona persona1 = new Persona(nombre,edad,peso,altura,genero);
        Persona persona2 = new Persona(nombre,edad,genero);
        Persona persona3 = new Persona();

        //SETEAR DATOS FALTANTES

        persona2.setPeso(67);
        persona2.setAltura(1.75);

        persona3.setNombre("Carlos");
        persona3.setEdad(27);
        persona3.setGenero('H');
        persona3.setPeso(110);
        persona3.setAltura(1.93);

//        MENSAJE DE IMC
        System.out.println("Primera persona");
        message(persona1);
        System.out.println("Segunda persona");
        message(persona2);
        System.out.println("Tercera persona");
        message(persona3);

//        SI ES MAYOR DE EDAD
        System.out.println("La primera persona es "+ mayorDeEdad(persona1));
        System.out.println("La segunda persona es "+ mayorDeEdad(persona2));
        System.out.println("La tercera persona es "+ mayorDeEdad(persona3));

//        INFORMACION GLOBAL
        System.out.println(persona1.toString());
        System.out.println("-------");
        System.out.println(persona2.toString());
        System.out.println("-------");
        System.out.println(persona3.toString());
    }

    public static void message(Persona persona){
        switch (persona.calcularIMC()){
            case -1:
                System.out.println("Se encuentra por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("Se encuentra en su  peso ideal");
                break;
            case 1:
                System.out.println("Se encuentra con sobrepeso!!");
                break;
        }
    }

    public static String mayorDeEdad(Persona persona){
        return persona.esMayorDeEdad()? "Es mayor de edad":"No es mayor de edad";
    }

}

