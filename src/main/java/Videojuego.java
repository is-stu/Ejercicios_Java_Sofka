public class Videojuego implements Entregable {

    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;
    private final static int horasEstimadasDEF = 10;
    private final static boolean entregadoDEF = false;
    private final static String tituloDEF = "";
    private final static String generoDEF = "";
    private final static String compaDEF = "";

    //Atributos -------------------------------
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    //CONSTRUCTORES -----------------------------------------

    public Videojuego() {
        this.titulo = tituloDEF;
        this.horasEstimadas = horasEstimadasDEF;
        this.entregado = entregadoDEF;
        this.genero = generoDEF;
        this.compania = compaDEF;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadoDEF;
        this.genero = generoDEF;
        this.compania = compaDEF;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadoDEF;
        this.genero = genero;
        this.compania = compania;
    }

//    GETTER AND SETTERS ------------------------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //    METODO TO STRING
    public String toString() {
        return "Informacion del videojuego: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tHoras estimadas: " + horasEstimadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tcompañia: " + compania;
    }


    //    METODOS IMPLEMENTADOS
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int estado = MENOR;

        Videojuego ref = (Videojuego) a;
        if (horasEstimadas > ref.getHorasEstimadas()) {
            estado = MAYOR;
        } else if (horasEstimadas == ref.getHorasEstimadas()) {
            estado = IGUAL;
        }

        return estado;
    }
}
