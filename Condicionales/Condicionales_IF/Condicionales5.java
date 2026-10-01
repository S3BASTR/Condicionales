public class Condicionales5 {
    public static void main(String[] args) {
        int montoFactura;
        
        System.out.println("Ingresa el total a pagar");
        montoFactura = Integer.parseInt(System.console().readLine());
        
        double cuotaPropiaAlta = 55;
        double creditoBanco = 30;
        double cuotaPropiaBaja = 70;
        double cuotaFabricante = 30;
        double interesFabricante = 20;
        
        double empresaPaga, bancoPresta, fabricantePresta, recargo;

        if (montoFactura > 500000) {
            empresaPaga = (montoFactura * cuotaPropiaAlta) / 100;
            bancoPresta = (montoFactura * creditoBanco) / 100;
            fabricantePresta = (montoFactura * cuotaFabricante) / 100;
            recargo = (fabricantePresta * interesFabricante) / 100;

            System.out.println("El monto que paga la empresa es: " + empresaPaga);
            System.out.println("El monto que presta el banco es de:" + bancoPresta);
            System.out.println("El monto que pesta el fabricante es de:" + fabricantePresta + " y la tasa de interes es de:" + recargo);
        }
        
        if (montoFactura <= 500000) {
            empresaPaga = (montoFactura * cuotaPropiaBaja) / 100;
            fabricantePresta = (montoFactura * cuotaFabricante) / 100;
            recargo = (fabricantePresta * interesFabricante) / 100;
            
            System.out.println("El monto que paga la empresa es: " + empresaPaga);
            System.out.println("El monto que pesta el fabricante es de:" + fabricantePresta + " y la tasa de interes es de:" + recargo);
        }
    }
}