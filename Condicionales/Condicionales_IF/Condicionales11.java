public class Condicionales11 {
    public static void main(String[] args) {

        int claseEmpleado;
        double salarioActual;
        double incrementoSalarial = 0;

        System.out.println("Ingrese la categoria del trabajador:");
        claseEmpleado = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo del trabajador:");
        salarioActual = Double.parseDouble(System.console().readLine());

        if (claseEmpleado == 1) {
            incrementoSalarial = salarioActual * 0.15;
        }
        
        if (claseEmpleado == 2) {
            incrementoSalarial = salarioActual * 0.10;
        }
        
        if (claseEmpleado == 3) {
            incrementoSalarial = salarioActual * 0.08;
        }
        
        if (claseEmpleado == 4) {
            incrementoSalarial = salarioActual * 0.07;
        }
        
        if (claseEmpleado < 1 || claseEmpleado > 4) {
            System.out.println("Categoria no valida.");
        }

        if (claseEmpleado >= 1 && claseEmpleado <= 4) {
            System.out.println("El aumento correspondiente es: $" + incrementoSalarial);
            System.out.println("El nuevo sueldo es: $" + (salarioActual + incrementoSalarial));
        }
    }
}