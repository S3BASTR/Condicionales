public class Condicionales7_switch {
    public static void main(String[] args) {
        int millar, centena, decena, unidad, numeroArmado;

        System.out.println("Ingresa el valor de A");
        millar = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de B");
        centena = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de C");
        decena = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de D");
        unidad = Integer.parseInt(System.console().readLine());
        
        numeroArmado = millar * 1000 + centena * 100 + decena * 10 + unidad;
        System.out.println("El numero es: " + numeroArmado);

        switch (decena) {
            case 0, 1, 2, 3, 4 -> {
                int redondeoAbajo = millar * 1000 + centena * 100;
                System.out.println("Si redondeamos, N=: " + redondeoAbajo);
            }
            case 5, 6, 7, 8, 9 -> {
                int redondeoArriba = millar * 1000 + (centena + 1) * 100;
                System.out.println("Si redondeamos, N=: " + redondeoArriba);
            }
            default -> System.out.println("El valor de C debe ser un digito entre 0 y 9.");
        }
    }
}