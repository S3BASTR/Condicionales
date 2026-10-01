public class Condicionales11_switch {
    public static void main(String[] args) {

        int tipoEmpleado;
        double salarioBase;
        double bonificacion;

        System.out.println("Ingrese la categoria del trabajador:");
        tipoEmpleado = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo del trabajador:");
        salarioBase = Double.parseDouble(System.console().readLine());

        switch (tipoEmpleado) {
            case 1 -> {
                bonificacion = salarioBase * 0.15;
                System.out.println("El aumento correspondiente es: $" + bonificacion);
                System.out.println("El nuevo sueldo es: $" + (salarioBase + bonificacion));
            }
            case 2 -> {
                bonificacion = salarioBase * 0.10;
                System.out.println("El aumento correspondiente es: $" + bonificacion);
                System.out.println("El nuevo sueldo es: $" + (salarioBase + bonificacion));
            }
            case 3 -> {
                bonificacion = salarioBase * 0.08;
                System.out.println("El aumento correspondiente es: $" + bonificacion);
                System.out.println("El nuevo sueldo es: $" + (salarioBase + bonificacion));
            }
            case 4 -> {
                bonificacion = salarioBase * 0.07;
                System.out.println("El aumento correspondiente es: $" + bonificacion);
                System.out.println("El nuevo sueldo es: $" + (salarioBase + bonificacion));
            }
            default -> System.out.println("Categoria no valida. Intente con categorias del 1 al 4.");
        }
    }
}