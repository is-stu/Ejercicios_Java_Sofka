public class Electrodomestico {

    protected static final String colorDEF = "Blanco";
    protected static final Character consumoDEF = 'F';
    protected static final Double precioBaseDEF = 100.0;
    protected static final Integer pesoDEF = 5;

    protected Double precioBase;
    protected String color;
    protected Integer peso;
    protected Character consumo;

    public Electrodomestico() {
        this.precioBase = precioBaseDEF;
        this.color = colorDEF;
        this.peso = pesoDEF;
        this.consumo = consumoDEF;
    }

    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.color = colorDEF;
        this.peso = peso;
        this.consumo = consumoDEF;
    }

    public Electrodomestico(Double precioBase, String color, Integer peso, Character consumo) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.peso = peso;
        this.consumo = consumo;
        comprobarConsumoEnergetico(consumo);
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Integer getPeso() {
        return peso;
    }

    public char getConsumo() {
        return consumo;
    }

    private void comprobarConsumoEnergetico(Character consumo) {
        Character[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean find = false;
        for (int i = 0; i < letras.length && !find; i++) {
            if (letras[i].equals(Character.toUpperCase(consumo)))
                find = true;
        }
        if (!find)
            this.color = colorDEF;

    }

    private void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean find = false;
        for (int i = 0; i < colores.length && !find; i++) {
            if (colores[i].equalsIgnoreCase(color))
                find = true;
        }
        if (!find)
            this.color = colorDEF;
    }

    public Double precioFinal() {
        Double plus = 0.0;
        plus += switchConsumo();
        plus += ifPeso();
        return precioBase + plus;
    }

    public Double switchConsumo(){
        switch (consumo) {
            case 'A':
                return 100.0;
            case 'B':
                return 80.0;
            case 'C':
                return 60.0;
            case 'D':
                return 50.0;
            case 'E':
                return 30.0;
            case 'F':
                return 10.0;
            default:
                return 0.0;
        }
    }

    public Double ifPeso(){
        Double plus = 0.0;
        if (peso >= 0 && peso < 19) {
            plus += 10.0;
        } else if (peso >= 20 && peso < 49) {
            plus += 50.0;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80.0;
        } else if (peso >= 80) {
            plus += 100.0;
        }

        return plus;
    }


}
