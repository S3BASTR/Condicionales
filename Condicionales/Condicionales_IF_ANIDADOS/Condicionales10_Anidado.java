public class Condicionales10_Anidado {
    public static void main(String[] args) {
        String clienteComprador;
        double totalFactura;
        double tasaRebaja;
        double valorRebajado;
        double totalAPagar;

        System.out.println("Ingrese el nombre del cliente:");
        clienteComprador = System.console().readLine();
        System.out.println("Ingrese el monto de la compra:");
        totalFactura = Double.parseDouble(System.console().readLine());

        if (totalFactura < 500) {
            tasaRebaja = 0.0;
        } else {
            if (totalFactura < 1000) {
                tasaRebaja = 0.05;
            } else {
                if (totalFactura < 7000) {
                    tasaRebaja = 0.11;
                } else {
                    if (totalFactura <= 15000) {
                        tasaRebaja = 0.18;
                    } else {
                        tasaRebaja = 0.25;
                    }
                }
            }
        }

        valorRebajado = totalFactura * tasaRebaja;
        totalAPagar = totalFactura - valorRebajado;

        System.out.println("El nombre del cliente es: " + clienteComprador);
        System.out.println("El monto de la compra es: " + totalFactura);
        System.out.println("El monto a pagar es: " + totalAPagar);
        System.out.println("El descuento recibido es: " + valorRebajado);
    }
}