public class Persona {

    private final static char generoDEF = 'H';
    private final static int underPeso = -1;
    private final static int idealPeso = 0;
    private final static int sobrePeso = 1;

    private String nombre, dni;
    private int edad, peso;
    private double altura;
    private char genero;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        generaDNI();
        this.genero = generoDEF;
        comprobarSexo();
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        generaDNI();
        this.edad = edad;
        this.genero = genero;
        comprobarSexo();
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, int peso, double altura, char genero) {
        this.nombre = nombre;
        generaDNI();
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        generaDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc >= 20 && imc <= 25) {
            return idealPeso;
        } else if (imc < 20) {
            return underPeso;
        } else {
            return sobrePeso;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void comprobarSexo() {
        if (genero != 'H' && genero != 'M')
            this.genero = generoDEF;
    }

    public String toString() {
        return "Informacion de la persona:\n"

                + "Nombre: " + nombre + "\n"

                + "Sexo: " + genero + "\n"

                + "Edad: " + edad + " años\n"

                + "DNI: " + dni + "\n"

                + "Peso: " + peso + " kg\n"

                + "Altura: " + altura + " metros\n";
    }

    private void generaDNI() {
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int i = numDNI - (numDNI / 23 * 23);
        char letraDNI = generaLetra(i);
        this.dni = Integer.toString(numDNI) + letraDNI;

    }

    private char generaLetra(int i) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',

                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',

                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


        return letras[i];
    }
}


