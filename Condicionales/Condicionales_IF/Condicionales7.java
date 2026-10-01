public class Condicionales7 {
    public static void main(String[] args) {
        int digMilar, digCentena, digDecena, digUnidad, numeroOriginal;

        System.out.println("Ingresa el valor de A");
        digMilar = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de B");
        digCentena = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de C");
        digDecena = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor de D");
        digUnidad = Integer.parseInt(System.console().readLine());
        
        numeroOriginal = digMilar * 1000 + digCentena * 100 + digDecena * 10 + digUnidad;
        System.out.println("El numero es: " + numeroOriginal);
        
        if (digDecena < 5) {
            int redondeoAbajo = digMilar * 1000 + digCentena * 100 + digDecena * 0 + digUnidad * 0;
            System.out.println("Si redondeamos, N=: " + redondeoAbajo);
        }
        
        if (digDecena >= 5) {
            int redondeoArriba = digMilar * 1000 + (digCentena + 1) * 100 + digDecena * 0 + digUnidad * 0;
            System.out.println("Si redondeamos, N=: " + redondeoArriba);
        }
    }
}