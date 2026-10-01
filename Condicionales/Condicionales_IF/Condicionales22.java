public class Condicionales22 {
    public static void main(String[] args) {
        double coefA;
        double coefB;
        double coefC;
        double discriminante;
        double raiz1;
        double raiz2;

        System.out.println("ingrese el valor de A");
        coefA = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de B");
        coefB = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de C");
        coefC = Double.parseDouble(System.console().readLine());

        discriminante =  coefB * coefB - 4 * coefA * coefC;
        System.out.println("la discriminante es " + discriminante);

        if (discriminante == 0) {
            raiz1 = -coefB / (2 * coefA);
            System.out.println("el valor de x1 es " + raiz1);
        }
        
        if (discriminante > 0) {
            raiz1 = (-coefB + Math.sqrt(discriminante)) / (2 * coefA);
            raiz2 = (-coefB - Math.sqrt(discriminante)) / (2 * coefA);
            System.out.println("el valor de x1 es " + raiz1);
            System.out.println("el valor de x2 es " + raiz2);
        }
        
        if (discriminante < 0) {
            System.out.println("No existe una solucion real. ");
        }
    }
}