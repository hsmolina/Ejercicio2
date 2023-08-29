public class App {
    public static void main(String[] args) throws Exception {
        /* Definimos las variables de tipo double y sus respectivos valores */
        double SUMA = 0, X = 20, Y = 40;

        /* Realizamos las operaciones solicitadas */
        SUMA = SUMA + X;
        /*
         * Para la potencia de Y utilizamos el método Math.pow(x,Y) con x asignando el
         * valor de potencia a Y
         */
        X = X + (Math.pow(Y, 2));
        SUMA = SUMA + (X / Y);

        System.out.println("Ejercicio #2");
        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);
    }
}
