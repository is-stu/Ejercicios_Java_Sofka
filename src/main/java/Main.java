
public class Main {

    public static void main(String[] args) {

        Electrodomestico electrodomestico[] = new Electrodomestico[10];

        electrodomestico[0] = new Electrodomestico(200.0, "Verde", 60, 'C');
        electrodomestico[1] = new Lavadora(150.0, 30);
        electrodomestico[2] = new Television(500.0, "Negro", 80, 'A', 42, false);
        electrodomestico[3] = new Electrodomestico();
        electrodomestico[4] = new Electrodomestico(600.0, "gris", 20, 'B');
        electrodomestico[5] = new Lavadora(300.0, "blanco", 40, 'z', 40);
        electrodomestico[6] = new Television(250.0, 70);
        electrodomestico[7] = new Lavadora(400.0, "Verde", 100, 'A', 15);
        electrodomestico[8] = new Television(200.0, "naranja", 60, 'C', 30, true);
        electrodomestico[9] = new Electrodomestico(50.0, 10);

        double sumElectro = 0;
        double sumTV = 0;
        double sumLavadora = 0;

        for (int i = 0; i < electrodomestico.length; i++) {
            if(electrodomestico[i] instanceof Electrodomestico){
                sumElectro+=electrodomestico[i].precioFinal();
            }
            if(electrodomestico[i] instanceof Lavadora){
                sumLavadora+=electrodomestico[i].precioFinal();
            }
            if(electrodomestico[i] instanceof Television){
                sumTV+=electrodomestico[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de "+sumElectro);
        System.out.println("La suma del precio de las lavadoras es de "+sumLavadora);
        System.out.println("La suma del precio de las televisiones es de "+sumTV);
    }
}

