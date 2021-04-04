public class Lavadora extends Electrodomestico {

    private static final int cargaDEF = 5;
    private int carga;

    public Lavadora() {
        this.carga = cargaDEF;
    }


    public Lavadora(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.carga = cargaDEF;
    }

    public Lavadora(Double precioBase, String color, Integer peso, Character consumo, int carga) {
        super(precioBase, color, peso, consumo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public Double precioFinal() {
        Double plus = super.precioFinal();

        if (carga > 30)
            plus += 50;

        return plus;
    }
}
