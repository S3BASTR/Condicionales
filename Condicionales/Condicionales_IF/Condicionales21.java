public class Condicionales21 {
    public static void main(String[] args) {
        int prestamoHipoteca, montoInversion;
        System.out.println("Ingrese el valor de la hipoteca:");
        prestamoHipoteca = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de la inversion:");
        montoInversion = Integer.parseInt(System.console().readLine());

        if (prestamoHipoteca < 1000000) {
            double inversionIndividual = (montoInversion * 0.50);
            double aporteSocioHip = (prestamoHipoteca * 0.50);
            System.out.println("El valor de la inversion es: " + inversionIndividual);
            System.out.println("Su socio debera invertir: " + aporteSocioHip);
        }
        
        if (prestamoHipoteca >= 1000000) {
            int capitalFaltante = montoInversion - prestamoHipoteca;
            double aportePorPartes = capitalFaltante / 2.0;
            System.out.println("El valor restante de la inversion es de: " + capitalFaltante);
            System.out.println("Entre su socio y usted, deben pagar: " + aportePorPartes + " cada uno");
        }
    }
}