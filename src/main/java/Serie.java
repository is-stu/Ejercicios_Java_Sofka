public class Serie implements Entregable {

    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;
    private final static int numTempDEF = 3;
    private final static String tituloDEF = "";
    private final static String generoDEF = "";
    private final static String creadorDEF = "";
    private final static boolean entregadoDEF = false;

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // CONSTRUCTORES  -----------------------------------------------------------
    public Serie() {
        this.titulo = tituloDEF;
        this.numeroTemporadas = numTempDEF;
        this.entregado = entregadoDEF;
        this.genero = generoDEF;
        this.creador = creadorDEF;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numTempDEF;
        this.entregado = entregadoDEF;
        this.genero = generoDEF;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregadoDEF;
        this.genero = genero;
        this.creador = creador;
    }

    //  GETTERS Y SETTERS -----------------------------------------------------------
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    // TO STRING SOBREESCRITO ---------------------------
    public String toString() {
        return "Informacion de la Serie: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tNumero de temporadas: " + numeroTemporadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tCreador: " + creador;
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

        Serie ref = (Serie) a;
        if (numeroTemporadas > ref.getNumeroTemporadas()) {
            estado = MAYOR;
        } else if (numeroTemporadas == ref.getNumeroTemporadas()) {
            estado = IGUAL;
        }

        return estado;
    }

}
