public class Condicionales12 {
    public static void main(String[] args) {
        double gradosFahrenheit;
       
        System.out.println("ingrese la tempera tura en grado fahrenheit");
        gradosFahrenheit = Double.parseDouble(System.console().readLine());

        if (gradosFahrenheit > 85) {
            System.out.println("El deporte apropiado es: Natacion. ");
        }
        
        if (gradosFahrenheit <= 85 && gradosFahrenheit > 70) {
            System.out.println("El deporte apropiado es: Tenis. ");
        }
        
        if (gradosFahrenheit <= 70 && gradosFahrenheit > 32) {
            System.out.println("El deporte apropiado es: Golf. ");
        }
        
        if (gradosFahrenheit <= 32 && gradosFahrenheit > 10) {
            System.out.println("El deporte apropiado es: Esqui. ");
        }
        
        if (gradosFahrenheit <= 10) {
            System.out.println("El deporte apropiado es: Marcha. ");
        }
    }
}