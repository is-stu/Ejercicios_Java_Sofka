public class Television extends Electrodomestico {

    private final static int resolucionDEF = 20;

    private int resolucion;
    private boolean sintoTDT;

    public Television() {
        this.resolucion = resolucionDEF;
        this.sintoTDT = false;
    }

    public Television(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDEF;
        this.sintoTDT = false;
    }

    public Television(Double precioBase, String color, Integer peso, Character consumo, int resolucion, boolean sintoTDT) {
        super(precioBase, color, peso, consumo);
        this.resolucion = resolucion;
        this.sintoTDT = sintoTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintoTDT() {
        return sintoTDT;
    }

    public Double precioFinal(){
        double plus=super.precioFinal();


        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintoTDT){
            plus+=50;
        }

        return plus;
    }
}
