public class Condicionales10 {
    public static void main(String[] args) {
        String cliente;
        double totalCompra;
        double tasaRebaja = 0;
        double valorRebajado;
        double totalFinal;

        System.out.println("Ingrese el nombre del cliente");
        cliente = System.console().readLine();
        System.out.println("Ingrese el monto de la compra");
        totalCompra = Double.parseDouble(System.console().readLine());

        if (totalCompra < 500) {
            tasaRebaja = 0;
        }
        
        if (totalCompra >= 500 && totalCompra < 1000) {
            tasaRebaja = 0.05;
        }
        
        if (totalCompra >= 1000 && totalCompra < 7000) {
            tasaRebaja = 0.11;
        }
        
        if (totalCompra >= 7000 && totalCompra <= 15000) {
            tasaRebaja = 0.18;
        }
        
        if (totalCompra > 15000) {
            tasaRebaja = 0.25;
        }

        valorRebajado = totalCompra * tasaRebaja;
        totalFinal = totalCompra - valorRebajado;

        System.out.println("el nombre del cliente es " + cliente);
        System.out.println("El monto de la compra es " + totalCompra);
        System.out.println("el monto a pagar es " + totalFinal);
        System.out.println("el descuento recibido es " + valorRebajado);
    }
}