public class Condicionales11_Anidado {
    public static void main(String[] args) {
        int claseLaboral;
        double salarioActual;
        double incrementoSalarial;

        System.out.println("Ingrese la categoria del trabajador (1-4):");
        claseLaboral = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo del trabajador:");
        salarioActual = Double.parseDouble(System.console().readLine());

        if (claseLaboral >= 1) {
            if (claseLaboral <= 4) {
                if (claseLaboral == 1) {
                    incrementoSalarial = salarioActual * 0.15;
                } else {
                    if (claseLaboral == 2) {
                        incrementoSalarial = salarioActual * 0.10;
                    } else {
                        if (claseLaboral == 3) {
                            incrementoSalarial = salarioActual * 0.08;
                        } else {
                            incrementoSalarial = salarioActual * 0.07;
                        }
                    }
                }
                System.out.println("El aumento correspondiente es: $" + incrementoSalarial);
                System.out.println("El nuevo sueldo es: $" + (salarioActual + incrementoSalarial));
            } else {
                System.out.println("Categoria no valida. Debe ser menor o igual a 4.");
            }
        } else {
            System.out.println("Categoria no valida. Debe ser mayor o igual a 1.");
        }
    }
}