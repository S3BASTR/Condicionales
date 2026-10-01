public class Condicionales15_switch {
    public static void main(String[] args) {
        int mesNac, diaNac, anioNac;

        System.out.println("¿Cuál es su mes de nacimiento?");
        mesNac = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su dia de nacimiento?");
        diaNac = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su año de nacimiento?");
        anioNac = Integer.parseInt(System.console().readLine());

        int calculoEdad = 2026 - anioNac;
        String cumpleañosPasado = String.valueOf(mesNac <= 8 && diaNac >= 18);

        switch (cumpleañosPasado) {
            case "true" -> System.out.println("su edad es:  " + calculoEdad);
            case "false" -> System.out.println("su edad es: " + (calculoEdad - 1));
        }

        String zodiaco = switch (mesNac) {
            case 1 -> switch (String.valueOf(diaNac <= 20)) { case "true" -> "capricornio"; default -> "acuario"; };
            case 2 -> switch (String.valueOf(diaNac <= 19)) { case "true" -> "acuario"; default -> "piscis"; };
            case 3 -> switch (String.valueOf(diaNac <= 19)) { case "true" -> "piscis"; default -> "aries"; };
            case 4 -> switch (String.valueOf(diaNac <= 20)) { case "true" -> "aries"; default -> "tauro"; };
            case 5 -> switch (String.valueOf(diaNac <= 21)) { case "true" -> "tauro"; default -> "geminis"; };
            case 6 -> switch (String.valueOf(diaNac <= 21)) { case "true" -> "geminis"; default -> "cancer"; };
            case 7 -> switch (String.valueOf(diaNac <= 22)) { case "true" -> "cancer"; default -> "leo"; };
            case 8 -> switch (String.valueOf(diaNac <= 23)) { case "true" -> "leo"; default -> "virgo"; };
            case 9 -> switch (String.valueOf(diaNac <= 22)) { case "true" -> "virgo"; default -> "libra"; };
            case 10 -> switch (String.valueOf(diaNac <= 22)) { case "true" -> "libra"; default -> "escorpio"; };
            case 11 -> switch (String.valueOf(diaNac <= 21)) { case "true" -> "escorpio"; default -> "sagitario"; };
            case 12 -> switch (String.valueOf(diaNac <= 21)) { case "true" -> "sagitario"; default -> "capricornio"; };
            default -> "Mes no valido";
        };

        System.out.println("su signo del zodiaco es " + zodiaco);
    }
}