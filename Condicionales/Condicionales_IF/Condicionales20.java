public class Condicionales20 {
    public static void main(String[] args) {

        double saldoActual;
        double creditoSolicitado = 0;
        double fondoDisponible = 0;
        double gastosInsumos;
        double pagoIncentivos;

        System.out.println("Ingrese el capital actual de la empresa:");
        saldoActual = Double.parseDouble(System.console().readLine());

        if (saldoActual < 0) {
            creditoSolicitado = 10000 - saldoActual;
            fondoDisponible = 10000;
        }
        
        if (saldoActual >= 0 && saldoActual <= 20000) {
            creditoSolicitado = 20000 - saldoActual;
            fondoDisponible = 20000;
        }
        
        if (saldoActual > 20000) {
            fondoDisponible = saldoActual;
        }

        fondoDisponible = fondoDisponible - 5000 - 2000;

        gastosInsumos = fondoDisponible / 2;
        pagoIncentivos = fondoDisponible / 2;

        System.out.println("Cantidad destinada a insumos: $" + gastosInsumos);
        System.out.println("Cantidad destinada a incentivos al personal: $" + pagoIncentivos);

        if (creditoSolicitado > 0) {
            System.out.println("La cantidad que se pedira al banco es: $" + creditoSolicitado);
        }
        
        if (creditoSolicitado <= 0) {
            System.out.println("No es necesario solicitar un prestamo al banco.");
        }
    }
}