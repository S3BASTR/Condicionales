public class Condicionales17 {
    public static void main(String[] args) {

        int medidaVieja;
        int medidaNueva;
        int kwhUsados;
        double tarifa = 0;
        double totalFactura;

        System.out.println("Ingrese la lectura anterior:");
        medidaVieja = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la lectura actual:");
        medidaNueva = Integer.parseInt(System.console().readLine());

        kwhUsados = medidaNueva - medidaVieja;

        if (kwhUsados <= 100) {
            tarifa = 2622.00;
        }
        
        if (kwhUsados > 100 && kwhUsados <= 300) {
            tarifa = 79.78;
        }
        
        if (kwhUsados > 300 && kwhUsados <= 500) {
            tarifa = 89.52;
        }
        
        if (kwhUsados > 500) {
            tarifa = 97.95;
        }

        totalFactura = kwhUsados * tarifa;

        System.out.println("El consumo de energia es: " + kwhUsados + " KWh");
        System.out.println("El costo por KWh es: " + tarifa + " Bs.");
        System.out.println("El monto a pagar es: " + totalFactura + " Bs.");
    }
}