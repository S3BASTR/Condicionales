public class Condicionales12_Anidado {
    public static void main(String[] args) {
        double gradosFahrenheit;

        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        gradosFahrenheit = Double.parseDouble(System.console().readLine());

        if (gradosFahrenheit > 85) {
            System.out.println("El deporte apropiado es: Natacion.");
        } else {
            if (gradosFahrenheit > 70) {
                System.out.println("El deporte apropiado es: Tenis.");
            } else {
                if (gradosFahrenheit > 32) {
                    System.out.println("El deporte apropiado es: Golf.");
                } else {
                    if (gradosFahrenheit > 10) {
                        System.out.println("El deporte apropiado es: Esqui.");
                    } else {
                        System.out.println("El deporte apropiado es: Marcha.");
                    }
                }
            }
        }
    }
}