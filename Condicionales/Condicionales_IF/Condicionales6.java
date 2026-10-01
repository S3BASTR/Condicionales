public class Condicionales6 {
    public static void main(String[] args) {

        double sueldoBase;
        double ventasDep1;
        double ventasDep2;
        double ventasDep3;
        double totalVentas;
        double umbralParaBono;
        double montoBono;
        double sueldoFinal1 = 0;
        double sueldoFinal2 = 0;
        double sueldoFinal3 = 0;

        System.out.print("Ingrese el salario minimo o salario base: $ ");
        sueldoBase = Double.parseDouble(System.console().readLine());

        System.out.print("Ingrese las ventas del departamento 1: $ ");
        ventasDep1 = Double.parseDouble(System.console().readLine());

        System.out.print("Ingrese las ventas del departamento 2: $ ");
        ventasDep2 = Double.parseDouble(System.console().readLine());

        System.out.print("Ingrese las ventas del departamento 3: $ ");
        ventasDep3 = Double.parseDouble(System.console().readLine());

        totalVentas = ventasDep1 + ventasDep2 + ventasDep3;
        umbralParaBono = totalVentas * 0.33;
        montoBono = sueldoBase * 0.20;

        if (ventasDep1 > umbralParaBono) {
            sueldoFinal1 = sueldoBase + montoBono;
        }
        if (ventasDep1 <= umbralParaBono) {
            sueldoFinal1 = sueldoBase;
        }

        if (ventasDep2 > umbralParaBono) {
            sueldoFinal2 = sueldoBase + montoBono;
        }
        if (ventasDep2 <= umbralParaBono) {
            sueldoFinal2 = sueldoBase;
        }

        if (ventasDep3 > umbralParaBono) {
            sueldoFinal3 = sueldoBase + montoBono;
        }
        if (ventasDep3 <= umbralParaBono) {
            sueldoFinal3 = sueldoBase;
        }
        
        System.out.println("Ventas totales: $" + totalVentas);
        System.out.println("33% de las ventas totales: $" + umbralParaBono);

        System.out.println("Pago Departamento 1: $" + sueldoFinal1);
        System.out.println("Pago Departamento 2: $" + sueldoFinal2);
        System.out.println("Pago Departamento 3: $" + sueldoFinal3);
    }
}