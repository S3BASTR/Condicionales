public class Condicionales19_switch {
    public static void main(String[] args) {
        float indiceHemoglobina;
        int edadPaciente;
        String generoP, tipoTiempo;

        System.out.println("cual su nivel de hemoglobina:");
        indiceHemoglobina = Float.parseFloat(System.console().readLine());
        System.out.println("cual su edad:");
        edadPaciente = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese su sexo (M/F):");
        generoP = System.console().readLine();
        System.out.println("¿La edad está en meses o años? (M/A):");
        tipoTiempo = System.console().readLine();

        switch (tipoTiempo.toUpperCase()) {
            case "M" -> {
                switch (edadPaciente) {
                    case 0, 1 -> {
                        switch (String.valueOf(indiceHemoglobina < 13)) {
                            case "true" -> System.out.println("Positivo para anemia");
                            case "false" -> System.out.println("Negativo para anemia");
                        }
                    }
                    case 2, 3, 4, 5, 6 -> {
                        switch (String.valueOf(indiceHemoglobina < 10)) {
                            case "true" -> System.out.println("Positivo para anemia");
                            case "false" -> System.out.println("Negativo para anemia");
                        }
                    }
                    case 7, 8, 9, 10, 11, 12 -> {
                        switch (String.valueOf(indiceHemoglobina < 11)) {
                            case "true" -> System.out.println("Positivo para anemia");
                            case "false" -> System.out.println("Negativo para anemia");
                        }
                    }
                    default -> System.out.println("Rango de meses no valido (debe ser entre 0 y 12).");
                }
            }
            case "A" -> {
                switch (edadPaciente) {
                    case 2, 3, 4, 5 -> {
                        switch (String.valueOf(indiceHemoglobina < 11.5)) {
                            case "true" -> System.out.println("Positivo para anemia");
                            case "false" -> System.out.println("Negativo para anemia");
                        }
                    }
                    case 6, 7, 8, 9, 10 -> {
                        switch (String.valueOf(indiceHemoglobina < 12.6)) {
                            case "true" -> System.out.println("Positivo para anemia");
                            case "false" -> System.out.println("Negativo para anemia");
                        }
                    }
                    case 11, 12, 13, 14, 15 -> {
                        switch (String.valueOf(indiceHemoglobina < 13)) {
                            case "true" -> System.out.println("Positivo para anemia");
                            case "false" -> System.out.println("Negativo para anemia");
                        }
                    }
                    case 0, 1 -> System.out.println("Para menores de 1 año utilice el sistema en meses (M).");
                    default -> {
                        // Aplica para mayores de 15 años
                        switch (generoP.toUpperCase()) {
                            case "F" -> {
                                switch (String.valueOf(indiceHemoglobina < 12)) {
                                    case "true" -> System.out.println("Positivo para anemia");
                                    case "false" -> System.out.println("Negativo para anemia");
                                }
                            }
                            case "M" -> {
                                switch (String.valueOf(indiceHemoglobina < 14)) {
                                    case "true" -> System.out.println("Positivo para anemia");
                                    case "false" -> System.out.println("Negativo para anemia");
                                }
                            }
                            default -> System.out.println("Sexo no valido. Use M o F.");
                        }
                    }
                }
            }
            default -> System.out.println("Unidad de tiempo no valida (debe ser M o A).");
        }
    }
}