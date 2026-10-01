public class Condicionales13 {
    public static void main(String[] args) {

        int montoBsf;

        System.out.println("Ingrese la cantidad de Bolívares:");
        montoBsf = Integer.parseInt(System.console().readLine());

        if (montoBsf >= 50000) {
            System.out.println("Billetes de 50000: " + montoBsf / 50000);
        }

        if (montoBsf >= 20000) {
            System.out.println("Billetes de 20000: " + montoBsf / 20000);
        }

        if (montoBsf >= 10000) {
            System.out.println("Billetes de 10000: " + montoBsf / 10000);
        }

        if (montoBsf >= 5000) {
            System.out.println("Billetes de 5000: " + montoBsf / 5000);
        }

        if (montoBsf >= 2000) {
            System.out.println("Billetes de 2000: " + montoBsf / 2000);
        }

        if (montoBsf >= 1000) {
            System.out.println("Billetes de 1000: " + montoBsf / 1000);
        }

        if (montoBsf >= 500) {
            System.out.println("Billetes de 500: " + montoBsf / 500);
        }

        if (montoBsf >= 100) {
            System.out.println("Billetes de 100: " + montoBsf / 100);
        }

        if (montoBsf >= 50) {
            System.out.println("Billetes de 50: " + montoBsf / 50);
        }

        if (montoBsf >= 20) {
            System.out.println("Billetes de 20: " + montoBsf / 20);
        }

        if (montoBsf >= 10) {
            System.out.println("Billetes de 10: " + montoBsf / 10);
        }
    }
}