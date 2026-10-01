public class Condicionales19 {
    public static void main(String[] args) {
        float nivelHemo;
        int edadPaciente;
        String generoP, tipoTiempo;

        System.out.println("cual su nivel de hemoglobina:");
        nivelHemo = Float.parseFloat(System.console().readLine());
        System.out.println("cual su edad:");
        edadPaciente = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese su sexo (M/F)");
        generoP = System.console().readLine();
        System.out.println("¿La edad está en meses o años? (M/A)");
        tipoTiempo = System.console().readLine();

        if (tipoTiempo.equalsIgnoreCase("M") && edadPaciente >= 0 && edadPaciente <= 1 && nivelHemo < 13) {
            System.out.println("Positivo para anemia");
        }
        if (tipoTiempo.equalsIgnoreCase("M") && edadPaciente >= 0 && edadPaciente <= 1 && nivelHemo >= 13) {
            System.out.println("Negativo para anemia");
        }
        
        if (tipoTiempo.equalsIgnoreCase("M") && edadPaciente > 1 && edadPaciente <= 6 && nivelHemo < 10) {
            System.out.println("Positivo para anemia");
        }
        if (tipoTiempo.equalsIgnoreCase("M") && edadPaciente > 1 && edadPaciente <= 6 && nivelHemo >= 10) {
            System.out.println("Negativo para anemia");
        }
        
        if (tipoTiempo.equalsIgnoreCase("M") && edadPaciente > 6 && edadPaciente <= 12 && nivelHemo < 11) {
            System.out.println("Positivo para anemia");
        }
        if (tipoTiempo.equalsIgnoreCase("M") && edadPaciente > 6 && edadPaciente <= 12 && nivelHemo >= 11) {
            System.out.println("Negativo para anemia");
        }
        
        if (tipoTiempo.equalsIgnoreCase("A") && edadPaciente > 1 && edadPaciente <= 5 && nivelHemo < 11.5) {
            System.out.println("Positivo para anemia");
        }
        if (tipoTiempo.equalsIgnoreCase("A") && edadPaciente > 1 && edadPaciente <= 5 && nivelHemo >= 11.5) {
            System.out.println("Negativo para anemia");
        }
        
        if (tipoTiempo.equalsIgnoreCase("A") && edadPaciente > 5 && edadPaciente <= 10 && nivelHemo < 12.6) {
            System.out.println("Positivo para anemia");
        }
        if (tipoTiempo.equalsIgnoreCase("A") && edadPaciente > 5 && edadPaciente <= 10 && nivelHemo >= 12.6) {
            System.out.println("Negativo para anemia");
        }
        
        if (tipoTiempo.equalsIgnoreCase("A") && edadPaciente > 10 && edadPaciente <= 15 && nivelHemo < 13) {
            System.out.println("Positivo para anemia");
        }
        if (tipoTiempo.equalsIgnoreCase("A") && edadPaciente > 10 && edadPaciente <= 15 && nivelHemo >= 13) {
            System.out.println("Negativo para anemia");
        }
        
        if (edadPaciente > 15 && generoP.equalsIgnoreCase("F") && nivelHemo < 12) {
            System.out.println("Positivo para anemia");
        }
        if (edadPaciente > 15 && generoP.equalsIgnoreCase("F") && nivelHemo >= 12) {
            System.out.println("Negativo para anemia");
        }
        
        if (edadPaciente > 15 && generoP.equalsIgnoreCase("M") && nivelHemo < 14) {
            System.out.println("Positivo para anemia");
        }
        if (edadPaciente > 15 && generoP.equalsIgnoreCase("M") && nivelHemo >= 14) {
            System.out.println("Negativo para anemia");
        }
    }
}